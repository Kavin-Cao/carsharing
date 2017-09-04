package com.threeplus1.carsharing;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TokenInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
        String token = request.getParameter("token");
        if(StringUtils.isBlank(token)){
            tokenErrorMsg(response,"请先登录");
            return false;
        }

        return true;
    }

    private void tokenErrorMsg(HttpServletResponse response, String msg){
        try {
            response.setHeader("content-type", "application/json;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(JSON.toJSONString(ApiResponse.error(ApiResponse.CODE_DEFAULT__TOKEN_ERROR,msg)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

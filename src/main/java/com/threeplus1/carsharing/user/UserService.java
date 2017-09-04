package com.threeplus1.carsharing.user;

import com.google.common.collect.Maps;
import com.threeplus1.carsharing.ApiResponse;
import com.threeplus1.carsharing.user.dao.UserDao;
import com.threeplus1.carsharing.user.dao.UserWalletDao;
import com.threeplus1.carsharing.user.entity.User;
import com.threeplus1.carsharing.user.entity.UserWallet;
import com.threeplus1.carsharing.user.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 用户相关接口Service,事务都处理在Service层
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserWalletDao userWalletDao;

    @Cacheable(cacheNames = "UserInfo")
    public ApiResponse login(LoginVo vo){
        User user = userDao.findByUserName(vo.getUserName());
        Map<String,Object> data = Maps.newHashMap();
        if(user == null){
            return ApiResponse.error(ApiResponse.CODE_DEFAULT__PARAM_ERROR,"查无此人");
        }
        UserWallet userWallet = userWalletDao.findByUserId(user.getId());
        data.put("user",user);
        data.put("userWallet",userWallet);
        return ApiResponse.success(data);
    }

}

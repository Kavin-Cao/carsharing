package com.threeplus1.carsharing.user;

import com.threeplus1.carsharing.ApiResponse;
import com.threeplus1.carsharing.user.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * app用户相关接口controller
 *
 * 全部API接口则可以在controller上使用RestController,
 * 相当于Controller + ResponseBody,
 * 详情见{@link RestController}
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ApiResponse login(LoginVo vo){
        return userService.login(vo);
    }
}

package com.threeplus1.carsharing.user.entity;

import com.threeplus1.carsharing.base.BaseEntity;

import javax.persistence.*;

/**
 * 用户信息entity
 */
@Entity(name = "cs_user")
public class User extends BaseEntity<Long>{

    @Column(length = 30,unique = true,nullable = false)
    private String userName;

    @Column(length = 40,unique = true,nullable = false)
    private String passwd;

    @Column(length = 16,unique = true,nullable = false)
    private String mobile;

    @Column(length = 30,unique = true)
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

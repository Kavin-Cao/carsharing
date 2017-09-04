package com.threeplus1.carsharing.user.entity;

import com.threeplus1.carsharing.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity(name = "cs_user_wallet")
public class UserWallet extends BaseEntity<Long>{

    private long userId;//关联用户

    private int balance;//余额

    private String passswd;//支付密码

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassswd() {
        return passswd;
    }

    public void setPassswd(String passswd) {
        this.passswd = passswd;
    }
}

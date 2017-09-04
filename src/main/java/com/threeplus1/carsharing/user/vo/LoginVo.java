package com.threeplus1.carsharing.user.vo;

import com.threeplus1.carsharing.base.BaseVo;
import com.threeplus1.carsharing.user.enums.LoginChannel;

public class LoginVo extends BaseVo {

    private String passwd;

    private String smscode;

    private LoginChannel LoginChannel;

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getSmscode() {
        return smscode;
    }

    public void setSmscode(String smscode) {
        this.smscode = smscode;
    }

    public com.threeplus1.carsharing.user.enums.LoginChannel getLoginChannel() {
        return LoginChannel;
    }

    public void setLoginChannel(com.threeplus1.carsharing.user.enums.LoginChannel loginChannel) {
        LoginChannel = loginChannel;
    }
}

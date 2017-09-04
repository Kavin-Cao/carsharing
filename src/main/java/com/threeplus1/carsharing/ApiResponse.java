package com.threeplus1.carsharing;

import com.google.common.collect.Maps;

import java.util.Map;

public class ApiResponse {

    public static int CODE_DEFAULT__SUCCESS = 200;

    /**
     * 默认code:服务器异常
     */
    public static int CODE_DEFAULT__EXCEPTION = -1;

    /**
     * 默认code:参数错误
     */
    public static int CODE_DEFAULT__PARAM_ERROR = -2;

    /**
     * 默认code:token错误
     */
    public static int CODE_DEFAULT__TOKEN_ERROR = -3;

    private int code;
    private String msg;
    private Map<String,Object> data;

    public ApiResponse(){
        super();
    }

    private ApiResponse(int code,String msg,Map<String,Object> data){
        this.code = code;
        if(msg == null){
            this.msg = msg;
        }else{
            this.msg = "";
        }
        if(data == null){
            this.data = Maps.newHashMap();
        }else{
            this.data = data;
        }

    }

    public static ApiResponse success(){
        return new ApiResponse(CODE_DEFAULT__SUCCESS,"success",null);
    }

    public static ApiResponse success(Map<String,Object> data){
        return new ApiResponse(CODE_DEFAULT__SUCCESS,"success",data);
    }

    public static ApiResponse error(int code, String msg){
        return new ApiResponse(code,msg, null);
    }

    public static ApiResponse error(int code, String msg,Map<String,Object> data){
        return new ApiResponse(code,msg, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}

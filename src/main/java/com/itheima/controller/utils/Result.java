package com.itheima.controller.utils;

import lombok.Data;

@Data
public class Result {

    private int code;

    private Object data;

    private  String msg;

    public Result(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public Result() {
    }

    public Result(int code, String msg){
        this.code = code;
        this.msg = msg;
    }


}

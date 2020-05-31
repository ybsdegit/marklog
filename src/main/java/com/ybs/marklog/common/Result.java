package com.ybs.marklog.common;

import lombok.Data;
import java.io.Serializable;

/**
 * Result
 * 统一返回结果集
 * @author Paulson
 * @date 2020/3/25 23:19
 */

@Data
public class Result<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    public Result() {
        this.code = ResultEnum.SUCCESS.getCode();
        this.msg = ResultEnum.SUCCESS.getMsg();
    }

    public Result(Integer code) {
        this.code = code;
        this.msg = ResultEnum.SUCCESS.getMsg();
    }

    public Result(String msg) {
        this.code = ResultEnum.SUCCESS.getCode();
        this.msg = msg;
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(T data) {
        this.code = ResultEnum.SUCCESS.getCode();
        this.msg = ResultEnum.SUCCESS.getMsg();
        this.data = data;
    }

    public Result(String msg, T data) {
        this.code = ResultEnum.SUCCESS.getCode();
        this.msg = msg;
        this.data = data;
    }

    public Result(ResultEnum resultEnum){
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result success() {
        return new Result();
    }

    public static Result success(Object data) {
        return new Result(data);
    }

    public static Result success(String message) {
        return new Result(message);
    }

    public static Result fail() {
        return new Result(ResultEnum.ERROR.getCode(), ResultEnum.ERROR.getMsg());
    }

    public static Result fail(String message) {
        return new Result(ResultEnum.ERROR.getCode(), message);
    }

    public static Result fail(Integer code, String message) {
        return new Result(code, message);
    }
}
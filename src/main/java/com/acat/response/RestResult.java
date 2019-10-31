package com.acat.response;

import com.acat.enums.GlobalCode;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-10-31
 */
public class RestResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 全局响应码
     */
    private int code;

    /**
     * 全局响应码说明
     */
    private String msg;

    /**
     * 响应数据
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T result;

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

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public RestResult(){
        super();
    }

    public RestResult(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public RestResult(int code,String msg,T result){
        super();
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public RestResult(T result){
        this(GlobalCode.SUCCESS.getCode(),GlobalCode.SUCCESS.getMsg());
    }

    public static <T> RestResult<T> ok(){
        RestResultBuilder builder = new RestResultBuilder();
        return builder.ok();
    }

    public static <T> RestResult<T> ok(T body) {
        RestResultBuilder builder = new RestResultBuilder();
        return builder.ok(body);
    }
    public static <T> RestResult<T> failure(int code , String msg) {
        RestResultBuilder builder = new RestResultBuilder();
        return builder.failure(code,msg,null);
    }

    public static <T> RestResult<T> failure(int code , String msg, T body) {
        RestResultBuilder builder = new RestResultBuilder();
        return builder.failure(code,msg,body);
    }

    public static class RestResultBuilder{
        public <T> RestResult<T> ok() {
            return ok(null);
        }

        public <T> RestResult<T> ok(T body) {
            return new RestResult<T>(GlobalCode.SUCCESS.getCode(), GlobalCode.SUCCESS.getMsg(),body);
        }

        public <T> RestResult<T> failure(int code , String msg, T body) {
            return new RestResult<T>(code,msg,body);
        }
    }

    public String toJson(){
        return JSON.toJSONString(this);
    }
}

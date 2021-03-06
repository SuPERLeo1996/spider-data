package com.leo.spider.data.entity;

/**
 * @ClassName CommonResponse.java
 * @Author Leo
 * @Description
 * @Date 2021/7/15
 */
public class CommonResponse<T> {

    private Integer code;
    private String message;
    private T data;


    public CommonResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResponse(T data) {
        this(200,"success",data);
    }

    public CommonResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

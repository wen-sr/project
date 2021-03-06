package com.wensir.project.common;

import com.github.pagehelper.PageInfo;

import java.io.Serializable;

/**
 * Created by wen-sr on 2017/8/23.
 */
public class ServerResponse<T> implements Serializable {
    private int status;
    private String msg;
    private T data;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ServerResponse() {
    }

    public ServerResponse(int status) {
        this.status = status;
    }

    public ServerResponse(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ServerResponse(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ServerResponse(int status, T data) {
        this.status = status;
        this.data = data;
    }

    public EasyuiTableResponse parseToEasyuiTableResponse(ServerResponse<PageInfo> response){
        EasyuiTableResponse easyuiTableResponse = new EasyuiTableResponse();
        easyuiTableResponse.setCode(response.getStatus());
        easyuiTableResponse.setRows(response.getData().getList());
        easyuiTableResponse.setMsg(response.getMsg());
        easyuiTableResponse.setTotal(response.getData().getTotal());
        easyuiTableResponse.setCount(response.getData().getTotal());
        return easyuiTableResponse;
    }

    //使之不再json序列化中
    //@JsonIgnore
    public Boolean isSuccess() {
        return this.status == ResponseCode.SUCCESS.getCode();
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public static <T> ServerResponse<T> createBySuccess() {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ServerResponse<T> createBySuccess(String msg, T data) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), msg, data);
    }

    public static <T> ServerResponse<T> createBySuccessMsg(String msg) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), msg);
    }

    public static <T> ServerResponse<T> createBySuccess(T data) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), data);
    }

    public static <T> ServerResponse<T> createByError(){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getDesc());
    }


    public static <T> ServerResponse<T> createByErrorMessage(String errorMessage){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),errorMessage);
    }

    public static <T> ServerResponse<T> createByErrorCodeMessage(int errorCode,String errorMessage){
        return new ServerResponse<T>(errorCode,errorMessage);
    }

}

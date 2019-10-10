package com.zk.messagesender.main;

public class Result {

    public static Result result=new Result("fail","系统停售期间");

    private String resultCode;
    private String msg;

    private Result(String resultCode,String msg){
        this.resultCode=resultCode;
        this.msg=msg;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

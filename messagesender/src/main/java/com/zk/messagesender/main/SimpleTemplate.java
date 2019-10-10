package com.zk.messagesender.main;

/**
 * 1.父类需要是抽象的，逻辑内容需要final
 * 2.可以添加钩子
 * 3.逻辑内容需要相同
 */
public abstract class SimpleTemplate {

    public final Result buyLottery(String param){

        if(close()){
            System.out.println("系统停售期间");
            return Result.result;
        }
        //参数以及数据校验
        validate(param);
        //支付
        pay(param);
        //网关出票
        Result result=outLottery(param);
        //出票结果
        if(!isDealError(result)){
            //退款
            refund(param);
        }
        //响应出票结果内容
        return result;
    }

    protected abstract void validate(String param);
    //支付都是一样的，这个可以实现
    private void pay(String param){
        System.out.println("完成支付");
    }
    private void refund(String param){
        System.out.println("完成退款");
    }
    protected abstract Result outLottery(String param);
    private boolean isDealError(Result result){

        if(result!=null && result.getResultCode().equals("success")){
            return false;
        }
        return true;
    }

    /**
     * 系统停售期间
     * @return
     */
    protected abstract boolean close();
}

package com.zk.messagesender.main;

public class JingCaiLottery extends SimpleTemplate{
    @Override
    protected void validate(String param) {
        System.out.println("竞猜验证");
    }

    @Override
    protected Result outLottery(String param) {
        return null;
    }

    @Override
    protected boolean close() {
        return false;
    }
}

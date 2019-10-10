package com.zk.messagesender.main;

public class MoneyValidator implements Validator{
    @Override
    public void valid(String param,ValidatorChain chain) {
        System.out.println("金钱验证");
        chain.execute();
    }
}

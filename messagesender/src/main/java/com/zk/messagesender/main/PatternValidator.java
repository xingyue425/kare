package com.zk.messagesender.main;

public class PatternValidator implements Validator{
    @Override
    public void valid(String param,ValidatorChain chain) {
        System.out.println("格式验证");
        chain.execute();
    }
}

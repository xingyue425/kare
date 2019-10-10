package com.zk.messagesender.main;

public class StaticSingle {

    private StaticSingle(){}

    /**
     * 加载的时候才会初始化
     */
    private static class SingleHolder{

        private static StaticSingle instance= new StaticSingle();
    }

    public static StaticSingle getInstance(){
        return SingleHolder.instance;
    }
}

package com.zk.messagesender.main;

public class SimpleSingle {

    //也可以直接初始化，但是不明白为啥会造成系统浪费资源
    private volatile static SimpleSingle instance=null;

    private SimpleSingle(){}

    /**
     * 放在方法外面就会导致每次进来都需要加锁，这样只有初始化的时候加锁
     * volatile 轻量级锁机制保证初始化完全
     * @return
     */
    public static SimpleSingle getInstance(){

        if(instance == null){
            synchronized (SimpleSingle.class){
                if(instance == null){
                    instance = new SimpleSingle();
                }
            }
        }
        return instance;
    }
}

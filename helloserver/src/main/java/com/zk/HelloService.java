package com.zk;

//https://blog.csdn.net/KnightOnHourse/article/details/80571502

import Ice.Current;
import hello._PrinterDisp;
import hello._PrinterOperations;
import hello._PrinterOperationsNC;

public class HelloService implements _PrinterOperationsNC {


    @Override
    public void printString(String s) {
        System.out.println("不知道为啥!");
    }
}

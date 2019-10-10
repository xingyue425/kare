package com.zk.messagesender.main;

import java.util.ArrayList;
import java.util.List;

public class ValidatorChain {

    private List<Validator> validtors=new ArrayList<Validator>();
    private int index=0;

    public void addValidtor(Validator item){
        this.validtors.add(item);
    }

    public void execute(){

        if(validtors.size()==0){
            return;
        }
        validtors.get(index).valid("",this);
        index++;
    }

}

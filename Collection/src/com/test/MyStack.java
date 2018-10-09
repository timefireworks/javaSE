package com.test;

import java.util.ArrayList;

/**
 * author: San Jinhong
 * date: 2018/10/9 17:02
 *
 * 实现栈
 **/
public class MyStack {

    private ArrayList list;

    public MyStack(){
        list = new ArrayList();
    }

    public void push(Object obj){
        list.add(obj);
    }

    public Object pop(){
        int index = list.size()-1;
        Object obj = list.get(index);
        list.remove(index);
        return obj;
    }

    public Object peek(){
        int index = list.size()-1;
        Object obj = list.get(index);
        return obj;
    }

    public int search(Object obj){
        return list.indexOf(obj);
    }

    public boolean isEmpty(){
        if(list.size() == 0){
            return true;
        }
        return false;
    }

}

package com.test;

/**
 * author: San Jinhong
 * date: 2018/10/9 17:12
 **/
public class TestMyStack {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push("aaa");
        myStack.push("bbb");
        myStack.push(new Integer(3));
        myStack.push('c');

        System.out.println(myStack.isEmpty());
        System.out.println(myStack.search("aaa"));
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());

    }
}

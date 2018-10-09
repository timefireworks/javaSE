package com.test;

import org.junit.Test;

/**
 * author: San Jinhong
 * date: 2018/10/9 11:06
 **/
public class MyTest {

    @Test
    public void test(){
        //<<,>>,>>>用法

        //int a = 23;
        int a = -23;
        System.out.println(Integer.toBinaryString(a));

        int i = a<<2;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);

        int j = a>>2;
        System.out.println(Integer.toBinaryString(j));
        System.out.println(j);

        int k = a>>>2;
        System.out.println(Integer.toBinaryString(k));
        System.out.println(k);

        System.out.println(Integer.MAX_VALUE);

    }
}

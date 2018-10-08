package com.test;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * author: San Jinhong
 * date: 2018/10/8 14:24
 **/
public class TestCollection {

    ArrayList<String> arrayList = null;
    Collection<String> collection = null;

    @Before
    public void before(){
        arrayList = new ArrayList<>();
        collection = new ArrayList<>();
    }

    @Test
    public void test(){

        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");

        System.out.println("arrayList:" + arrayList);
        System.out.println(arrayList.contains("aaa"));

        arrayList.remove("aaa");
        System.out.println(arrayList.size());

        collection.add("111");
        collection.add("222");
        collection.add("333");
        collection.add("bbb");

        //ArrayList的clone可以复制集合
        ArrayList<String> arrayList1 = (ArrayList<String>) arrayList.clone();
        //合并集合
        arrayList1.addAll(collection);

        System.out.println("arrayList1:" + arrayList1);

        arrayList1 = (ArrayList<String>) arrayList.clone();
        //同时位于collection和arrayList1中的元素
        arrayList1.retainAll(collection);
        System.out.println(arrayList1);

        arrayList1 = (ArrayList<String>) arrayList.clone();
        arrayList1.removeAll(collection);
        System.out.println(arrayList1);

    }

}

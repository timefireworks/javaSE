package com.test;

import org.junit.Test;

import java.util.*;

/**
 * author: San Jinhong
 * date: 2018/10/9 10:20
 **/
public class TestCollections {

    @Test
    public void test(){
        List<String> list = Arrays.asList("aaa", "bbb", "ccc");
        Collections.reverse(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        List<Person> list1 = Arrays.asList(new Person("张三"), new Person("李四"), new Person("王五"));
        System.out.println(list1);
        //逆序排列
        Collections.reverse(list1);
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        //不能使用List,因为List是接口不能执行添加操作，会报UnsupportedOperationException异常
        Collections.addAll(list2, "fjasdkfj", "jfsdkafjkdfja", "aaaaa");
        System.out.println(list2);
        //排序
        Collections.sort(list2);
        System.out.println(list2);

        //逆序
        List<String> list3 = Arrays.asList("blue", "red", "green", "yellow");
        Collections.sort(list3, Collections.reverseOrder());
        System.out.println(list3);

        //二分
        List<Integer> list4 = Arrays.asList(2, 4, 6, 7, 9, 14, 17, 18, 18, 19, 20, 28, 30);
        System.out.println(Collections.binarySearch(list4, 18));

        //随机重新排序
        Collections.shuffle(list3);
        System.out.println(list3);

        List<String> list5 = Arrays.asList("blue", "red", "green", "yellow");
        Collections.shuffle(list3, new Random(20));
        Collections.shuffle(list5, new Random(20));
        System.out.println(list3);
        System.out.println(list5);


    }
}

class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

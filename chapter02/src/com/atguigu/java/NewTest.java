package com.atguigu.java;

import java.io.File;

/**
 * @author shkstart
 * @create 2020-09-08 9:10
 * <p>
 * 指令4：对象、数组的创建与访问指令
 */
public class NewTest {

    public Order order;
    public static final String staticFinalName = "staticFinalName";
    public static String staticName = "staticName";
    public String normalName = "normalName";

    /**
     * 测试字段获取情况
     */
    public void testOpeField() {
        System.out.println(NewTest.staticFinalName);
        System.out.println(NewTest.staticName);
        System.out.println(normalName);
        staticName = "aaaa";
        order = new Order();
    }

    /**
     * 创建指令
     */
    public void newInstance() {
        Object obj = new Object();
        File file = new File("atguigu.avi");
    }

    public void newArray() {
        int[] intArray = new int[10];
        Object[] objArray = new Object[10];
        int[][] mintArray = new int[10][10];
        String[][] strArray = new String[10][];
    }


    /**
     * 字段访问指令
     */
    public void sayHello() {
        System.out.println("hello");
    }

    public void setOrderId() {
        Order order = new Order();
        order.id = 1001;
        System.out.println(order.id);

        Order.name = "ORDER";
        System.out.println(Order.name);
    }

    /**
     * 数组操作指令
     */
    public void setArray() {
        int[] intArray = new int[10];
        intArray[3] = 20;
        System.out.println(intArray[1]);

        boolean[] arr = new boolean[10];
        arr[1] = true;
    }

    public void arrLength() {

        double[] arr = new double[10];
        System.out.println(arr.length);
    }

    /**
     * 类型检查指令
     *
     * @param obj
     * @return
     */
    public String checkCast(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        } else {
            return null;
        }
    }

}


class Order {
    int id;
    static String name;
}

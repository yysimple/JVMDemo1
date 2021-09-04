package com.atguigu.java;

import java.util.Date;

/**
 * @author shkstart
 * @create 2020-09-07 21:26
 * <p>
 * 指令1：加载与存储指令
 */
public class LoadAndStoreTest {

    /**
     * 局部变量压栈指令
     *
     * @param num
     * @param obj
     * @param count
     * @param flag
     * @param arr
     */
    public void load(int num, Object obj, long count, boolean flag, short[] arr) {
        System.out.println(num);
        System.out.println(obj);
        System.out.println(count);
        System.out.println(flag);
        System.out.println(arr);
    }

    int aa;

    /**
     * 常量入栈指令
     */
    public void pushConstLdc() {
        int i = -1;
        int a = 5;
        int b = 6;
        int c = 127;
        int d = 128;
        int e = 32767;
        int f = 32768;

        aa = 2;

    }

    public void allShow() {
        byte a = 1;
        short b = 1;
        boolean c = true;
        char d = 1;
        int e = 1;
        float f = 1;
        long g = 1;
        double h = 1;
    }

    public void constLdc() {
        long a1 = 1;
        long a2 = 2;
        float b1 = 2;
        float b2 = 3;
        double c1 = 1;
        double c2 = 2;
        Date d = null;

    }

    /**
     * 出栈装入局部变量表指令
     *
     * @param k
     * @param d
     */
    public void store(int k, double d) {
        int m = k + 2;
        long l = 12;
        String str = "atguigu";
        float f = 10.0F;
        d = 10;
    }

    public void foo(long l, float f) {
        {
            int i = 0;
        }
        {
            String s = "Hello, World";
        }
    }

    public static void main(String[] args) {
        byte b = -1;
        int a = b;
        /*System.out.println("a: " + a);
        System.out.println("b: " + b);*/
    }

}

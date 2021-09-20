package com.atguigu.java;

import org.junit.Test;

/**
 * @author shkstart
 * @create 2020-09-07 23:28
 * <p>
 * 指令2：算术指令
 */
public class ArithmeticTest {

    @Test
    public void test1() {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        System.out.println(a);
        System.out.println(a + b);
    }

    @Test
    public void test2() {
        float a = 1.22022222222222222f;
        float b = a * 1.22022222222222222f;
        int c = (int) a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    @Test
    public void method1() {
        int i = 10;
        double j = i / 0.0;
        //无穷大 Infinity
        System.out.println(j);
        double d1 = 0.0;
        double d2 = d1 / 0.0;
        //NaN: not a number
        System.out.println(d2);
    }

    public void method2() {
        float i = 10;
        float j = -i;
        i = -j;
    }

    public void method3(int j) {
        int i = 100;
        i = i + 10;
        i += 10;
        System.out.println(i);
    }

    public int method4() {
        int a = 80;
        int b = 7;
        int c = 10;
        return (a + b) * c;
    }

    public int method5(int a, int b) {
        int add = b + a;
        int sub = b - a;
        int multi = b * a;
        int div = b / a;
        a++;
        int rem = a % b;
        int and = a & b;
        int or = a | b;
        int neg = ~(11110111);
        int xor = a ^ b;
        int shl = a << 1;
        return 0;
    }

    @Test
    public void bitMove(){
        int a = 1;
        int b = 2;
        int c = a << b;
        System.out.println(c);
    }

    /**
     * 关于(前)++和(后)++
     */
    public void method6() {
        int i = 10;
        int j = ++i;
        // ++i;
        //int j = i;
        System.out.println(i);
        System.out.println(j);
//        for (int j = 0; j < 10; j++) {
//        }
    }

    public void method7() {
        int i = 10;
        int a = i++;

        int j = 20;
        int b = ++j;
    }

    public void method8() {
        int i = 10;
        i = i++;
        //10
        System.out.println(i);
    }

    public void method9(int a, int b,
                        byte c, byte d,
                        short e, short f,
                        float g, float h,
                        long i, long j,
                        double k, double l) {
        if (a > b) {}
        if (c > d) {}
        if (e > f) {}
        if (g > h) {}
        if (i > j) {}
        if (k > l) {}
    }



    public static void main(String[] args) {
        ArithmeticTest arithmeticTest = new ArithmeticTest();
        arithmeticTest.method3(1);
        arithmeticTest.method6();
    }
}

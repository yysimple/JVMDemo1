package com.atguigu.java1;

/**
 * @author shkstart
 * @create 2020-09-04 19:03
 */
public class ArrayTest {
    public static void main(String[] args) {
        Object[] arr = new Object[10];
        //[Ljava.lang.Object;@1540e19d
        System.out.println(arr);

        //[Ljava.lang.String;@677327b6
        String[] arr1 = new String[10];
        System.out.println(arr1);

        //[[J@14ae5a5
        long[][] arr2 = new long[10][];
        System.out.println(arr2);
    }
}

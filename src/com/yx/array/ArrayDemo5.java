package com.yx.array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        /*
            数组的常见问题：
                索引越界

            针对任意一个数组而言，索引的范围都是[0,数组长度-1]

        */

        int[] arr = {10,20,30,40,50};
        /*System.out.println(arr[10]);  报错：Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
        	at com.yx.array.ArrayDemo5.main(ArrayDemo5.java:14)  */
    }
}

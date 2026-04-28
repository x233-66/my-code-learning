package com.yx.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        /*
            数组的遍历
                定义一个整数数组，里面存储任意数据，并将数组遍历并打印
        */

        int[] arr = {10,20,30,40,50};

        //方式一:
       /* for (int i = 0; i <= 4; i++) {
            System.out.println(arr[i]);
        }
        */

        //方式二:
        //获取数组的长度
        //length 获取数组中元素的个数
/*        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        //遍历数组的快速生成方式
        //数组名.fori + 回车
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

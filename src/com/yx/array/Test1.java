package com.yx.array;

public class Test1 {
    public static void main(String[] args) {
        /*
            获取数组中的最大值：
                 需求：已知数组元素为{33，5，22，44，55}
                 请求出数组中的最大值并打印在控制台
        */

        //1.创建数组
        int[] arr = {33,5,22,44,55};

        //2.定义一个变量（假设数组的第一个元素为最大值）
        int max = arr[0];//初始化值不能为0，如果数组中元素为负数，则max为0，出错！

        //3.遍历数组，得到数组中的每一个元素，并和max比较
        for (int i = 0; i < arr.length; i++) {
            //判断
            if(arr[i] > max){
                max = arr[i];
            }
        }

        //4.打印最大值
        System.out.println(max);
    }
}

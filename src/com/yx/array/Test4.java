package com.yx.array;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /*
            打乱数组中的数据：
                需求：已知数组元素为{1，2，3，4，5，6，7，8，9，10}
                要求：打乱数组中的数据
        */

        Random r = new Random();

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //交换数据
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        //输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

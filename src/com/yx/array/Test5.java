package com.yx.array;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        //去除重复元素（力扣）
        //需求：获取10个1-100的随机数并存入到数组中，要求保证数据是唯一的

        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < arr.length; ) {
            int num = r.nextInt(100) + 1;
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (num == arr[j]) {
                    count++;
                    //跳出内循环
                    break;
                }
            }
            //对count进行判断
            if (count == 0) {
                arr[i] = num;
                //只有满足count==0，i才会加1（重要）
                i++;
            }
        }

        //3.遍历数组并打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

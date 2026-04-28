package com.yx.array;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
            查找数据
                需求：已知数组元素为{33，5，22，44，55，33}
                键盘录入任意一个数据，查找这个数据在数组中是否存在
                如果数组中查找的数据出现多次，只显示第一次的索引即可
                输出要求：
                        1. 如果存在，输出索引
                        2. 如果不存在，提示：“该数据不存在”
        */
        int[] arr = {33, 5, 22, 44, 55, 33};

        System.out.print("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        //可以定义布尔变量，判断数据是否存在
        //Boolean flag = false;
        int count = 0;//计数器思想
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                count++;
                //flag = true;
                System.out.println("存在，索引为："+i);
                break;
            }
        }
        /*if(!flag){
            System.out.println("该数据不存在");
        }*/
        if(count == 0){
            System.out.println("该数据不存在");
        }
    }
}



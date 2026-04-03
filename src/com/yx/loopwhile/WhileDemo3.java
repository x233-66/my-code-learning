package com.yx.loopwhile;

public class WhileDemo3 {
    public static void main(String[] args) {
        /*折叠纸张：世界最高峰珠穆朗玛峰高度是：8848.86米=8848860毫米
        * 加假如我有一张足够大的纸，它的厚度是0.1毫米
        * 请问：该纸折叠多少次，可以折成珠穆朗玛峰的高度？*/

        int count = 0;
        double height =0.1;
        while(height<=8848860){
            height = height*2;
            count++;
        }
        System.out.println(count);
    }
}

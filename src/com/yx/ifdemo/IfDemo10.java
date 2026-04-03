package com.yx.ifdemo;

import java.util.Scanner;

public class IfDemo10 {
    public static void main(String[] args) {
        //判断平面直角坐标系中的点所在位置
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入点的坐标：");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x==0&&y==0) System.out.println("原点");
        else if(x==0) System.out.println("在y轴");
        else if(y==0) System.out.println("在x轴");
        else if(x>0&&y>0) System.out.println("第一象限");
        else if(x<0&&y>0) System.out.println("第二象限");
        else if(x<0&&y<0) System.out.println("第三象限");
        else System.out.println("第四象限");
    }
}

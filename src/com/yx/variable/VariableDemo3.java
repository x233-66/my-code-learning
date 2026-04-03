package com.yx.variable;

public class VariableDemo3 {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println(b);

        short s = 32767;
        System.out.println(s);

        int i = 2147483647;
        System.out.println(i);

        //细节：long类型必须以l或L结尾
        //建议：用大写L结尾
        long l = 9223372036854775807L;
        System.out.println(l);


        //细节：float类型必须以f或F结尾
        //建议：用大写F结尾
        float f = 3.14f;
        System.out.println(f);

        double d = 3.14;
        System.out.println(d);

        char c = 'a';
        System.out.println(c);

        boolean bool = true;
        System.out.println(bool);

        //数据类型分为基本数据类型和引用数据类型
        //基本数据类型：byte short int long float double char boolean
        //整数、小数取值范围大小关系：double > float > long > int > short > byte
        //long、float类型必须以L、F结尾
    }
}

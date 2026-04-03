package com.yx.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        int wxye =0;
        int zfbye = 10;
        int yhye = 20;
        int sum =0;
        System.out.println(wxye+zfbye+yhye);
        wxye+=10;
        wxye-=2;
        System.out.println(wxye+zfbye+yhye);

        //注：1.变量在使用前一定要先赋值
//            2.一条语句可以定义多个变量，也可以连续赋值(不建议)
        int a,b,c;
        a=b=c=10;
        System.out.println(a+b+c);

    }
}


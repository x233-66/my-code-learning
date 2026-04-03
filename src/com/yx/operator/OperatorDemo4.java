package com.yx.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        //数据类型转换


        //一、隐式转换
       /* 触发时机：不同类型的数据进行运算，默认采用隐式转换，Java自动转换，无需我们写代码
          转换步骤1：如有byte short类型的数据，先提升为int类型
          转换步骤2：把取值范围小的提升为取值范围大的，再进行运算*/

        //二、强制转换
        /*弊端：有可能导致精度丢失
          触发时机：强制转换不会自动触发，需要手动写代码
          书写格式：目标数据变量 变量名=（目标数据类型）被强转的数据*/
        int a = 10;
        byte b = (byte)a;
        //对结果进行转换
        byte c = 10;
        byte d = 20;
        byte e = (byte)(c+d);


    }
}

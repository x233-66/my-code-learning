package com.yx.switchdemo;

public class SwitchDemo4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String operator = "+";
        int result = switch(operator){
            case "+" -> a+b;
            case "-" -> a-b;
            case "*" -> a*b;
            case "/" -> a/b;
            default -> 0;
        };
        System.out.println(result);
    }
}

//if、swtch使用场景：当case是有限个的时候优先使用swtch，当case是一个范围的时候优先使用if

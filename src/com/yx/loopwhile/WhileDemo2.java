package com.yx.loopwhile;

public class WhileDemo2 {
    public static void main(String[] args) {
        /*
        * 假设在银行投资了100000元，银行给出的复利是1.7%，问多少年后能实现本金翻倍
        * 复利：前一年利息计入本金，下一年继续算利息*/

        double money = 100000;
        int year = 0;
        while(money<=200000){
            money =money+money*0.017;
            year++;
        }
        System.out.println("需要"+year+"年后，本金翻倍");
    }
}

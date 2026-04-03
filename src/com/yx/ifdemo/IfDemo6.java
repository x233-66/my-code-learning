package com.yx.ifdemo;

public class IfDemo6 {
    public static void main(String[] args) {
        double price = 1000;
        double discountPrice = 0;
        if(price>0) {
            if(price<10) discountPrice =0;
            else if(price<50) discountPrice = 8;
            else if(price<100) discountPrice = 30;
            else if(price<200) discountPrice = 50;
            else discountPrice = 90;
        }
        System.out.println("优惠卷可以少付的钱："+discountPrice);
        double memberPrice = price*0.2;
        System.out.println("会员可以少付的钱："+memberPrice);
        if(memberPrice>discountPrice){
            System.out.println("会员少付的钱更多："+memberPrice);
        }
        else{
            System.out.println("优惠卷少付的钱更多："+discountPrice);
        }
    }
}

package com.dyc.code.xunhuan;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
//给定两整数被除数和除数（整数且不超过int范围）要求不用乘除和取余得到商和余数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个正整数");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =a;
        if(b > a){
            a = b;
            b = c;
        }
        int sum = 0;
     while((a-b) >= 0){
         sum++;
         a=a-b;
     }
        System.out.println("商是" + sum + "余数是" + a);
    }
}
//还有一种do while
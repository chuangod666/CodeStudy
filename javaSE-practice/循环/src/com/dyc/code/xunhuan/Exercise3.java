package com.dyc.code.xunhuan;

import java.util.Scanner;

//逢七过练习（1~100）
public class Exercise3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if(i % 10 == 7 || i / 10 == 7){
                System.out.println("过");
            }
            else {
                System.out.println(i);
            }
        }
//求大于等于2的整数的平方根（保留整数）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数");
        int a = sc.nextInt();
        int b = 0;
        for (;b <= a / 2;b++){
            if (b * b > a){
                break;
            }
        }
        b = b -1;
        System.out.println("它的平方根是" + b);
//求正整数是否为质数
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int c1 = sc1.nextInt();
        boolean flag = true;
        for (int i = 2; i*i < c1; i++){   //这里可以用i < c1的平方根
            if(c1 % i == 0){
               flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("这个数是质数");
        }
        else{
            System.out.println("这个数不是质数");
        }
    }
}

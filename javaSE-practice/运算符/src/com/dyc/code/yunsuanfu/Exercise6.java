package com.dyc.code.yunsuanfu;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数");
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean result = a == 6 || b == 6 || (a + b) % 6 ==0 ;
        System.out.println(result);
    }
}

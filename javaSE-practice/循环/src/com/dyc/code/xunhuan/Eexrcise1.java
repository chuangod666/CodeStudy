package com.dyc.code.xunhuan;

import java.util.Scanner;

public class Eexrcise1 {
    public static void main(String[] args) {
// 回文数判断 整数x，如121
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = sc.nextInt();
        int temp = a;//临时记录a值
        int num = 0;
        while(a != 0){
            int ge = a % 10;
            a = a / 10;
            num = num*10 + ge;
        }
        System.out.println(num);
        System.out.println(a);
        System.out.println(temp == num);

    }
}

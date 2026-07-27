package com.dyc.code.zifuchuan;

import java.util.Scanner;

//键盘录入一个字符串 控制台遍历 有固定方法charAt
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1 = sc.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            System.out.print(c);
        }
    }
}

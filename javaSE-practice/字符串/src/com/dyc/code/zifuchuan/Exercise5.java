package com.dyc.code.zifuchuan;

import java.util.Scanner;

//定义方法字符串反转 键盘录入abc 输出cba
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String str = sc.nextLine();
        test(str);
        System.out.println();
        System.out.println(test1(str));
    }

    public static void test(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            System.out.printf("%c", ch);
        }
    }

    public static String test1(String str) {
        String result = "";  // 用变量拼接
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            result = result + ch;  // 拼接成新字符串
        }
        return result;
    }
}
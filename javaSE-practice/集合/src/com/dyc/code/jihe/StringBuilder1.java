package com.dyc.code.jihe;

import java.util.Scanner;

public class StringBuilder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String c = sb.reverse().toString();
        boolean a = str.equals(c);
        System.out.println(a);
   }
}

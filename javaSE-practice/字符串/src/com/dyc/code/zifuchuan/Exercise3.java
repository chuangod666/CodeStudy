package com.dyc.code.zifuchuan;

import java.util.Scanner;

//键盘录入一个字符串，统计大写 小写 数字个数 不考虑其他
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String s1 = sc.next();
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(c >= 'a' && c <='z'){
                smallCount++;
            }else if(c >= 'A' && c <='Z'){
                bigCount++;
            }else if(c >= '0' && c <='9'){
                numCount++;
            }
        }
        System.out.println("大写字母有" + bigCount  + "个，"+ "小写字母有" + smallCount + "个" + "数字有" + numCount +"个");
    }
}

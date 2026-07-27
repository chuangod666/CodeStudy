package com.dyc.code.zifuchuan;

import java.util.Scanner;

//用户登录 已知用户名和密码 三次机会 登录后给出相应提示
public class Exercise1 {
    public static void main(String[] args) {
        String s1 = "董裕川";
        String s2 = "123123";
        Scanner sc = new Scanner(System.in);
        for (int i = 1;i <= 66;i ++){
            if(i <= 3){
                System.out.println("请输入用户名");
                String s3 = sc.nextLine();
                System.out.println("请输入密码");
                String s4 = sc.nextLine();
               boolean a = s1.equals(s3) && s2.equals(s4);
               if(a){
                   System.out.println("登陆成功");
                   break;
               } else {
                   System.out.println("您还有" + (3 - i) + "次机会");
               }

            }else {
                System.out.println("三次用户名密码错误，请稍后再试");
                break;
            }


        }
    }
}

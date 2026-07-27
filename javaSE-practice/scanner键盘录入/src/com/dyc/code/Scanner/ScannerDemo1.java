package com.dyc.code.Scanner;

import java.util.Scanner;          //1.导包
public class ScannerDemo1{         //类名不能用关键字
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   //2.创建对象，表示要用Scanner这个类
        System.out.println("请输入一个整数");
        int i = sc.nextInt();                  //3.接收数据i
        System.out.println("你输入了" + i);

    }
}
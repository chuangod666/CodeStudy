package com.dyc.code.Scanner;
 //这是一个键盘录入的小练习
import java.util.Scanner;
   public class ScannerTest {
       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           System.out.println("请输入两个整数");
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c= a + b;
           System.out.println("它们的和是" + c);
       }

   }
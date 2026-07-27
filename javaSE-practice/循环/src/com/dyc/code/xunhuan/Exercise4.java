package com.dyc.code.xunhuan;

import java.util.Random;
import java.util.Scanner;

//生成随机数 猜（1~100）  //写错了很多次 注意声明和使用的位置
public class Exercise4 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(101) + 1;    // 包左不包右
        Scanner sc = new Scanner(System.in);
        int count = 0;                             //计数器
      while(true){
          System.out.println("这个数在1~100之内，猜一猜是几");
          int b = sc.nextInt();
          count++;
          if(count == 10){
              System.out.println("也也也也太衰");
              break;
          }

          if (b > a){
              System.out.println("大了");
          } else if (b < a) {
              System.out.println("小了");
          }
          else {
              System.out.println("猜对啦");
              break;
          }

      }

    }
}

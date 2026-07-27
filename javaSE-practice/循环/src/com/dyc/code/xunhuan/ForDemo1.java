package com.dyc.code.xunhuan;

import java.util.Scanner;

public class ForDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello world");
        }
        for (int a = 1;a <= 5;a++) {
            System.out.println(a);
        }
        for (int b = 1;b <= 5;b++) {
            System.out.println("第" + b + "次断线重连中");
        }
//求和练习
        int sum = 0;
        for (int c = 1;c <= 5;c++){
            sum = sum + c;
        }
        System.out.println(sum);
//求偶数和练习
        int sum2 = 0;
        for (int d = 1;d <= 100;d++){
            if (d % 2 == 0){
                sum2 = sum2 + d;
            }
        }
        System.out.println(sum2);
//统计满足任意两个数间能被3和5同时整除的数字有多少个
        int sum3 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请任意输入两个数字");
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int z = x; z <= y; z++) {
            if (z % 3 == 0 && z % 5 == 0){
                sum3 +=1;
            }
        }
        System.out.println(sum3);

    }
}
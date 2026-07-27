package com.dyc.code.zonghelianxi;

import java.util.Scanner;

//数字加密（每位数加5对10取余再反转）
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("请输入要加密的的数字密码");
             num = sc.nextInt();

            if (num > 0) {
                break;
            } else
            {
                System.out.println("密码应为正数");
            }
        }
            int temp = num;
            int count = 0;
            while (num != 0) {
                num = num / 10;
                count++;                              //得到位数
            }
            int[] arr = new int[count];
            for (int i = arr.length - 1; i >= 0; i--) {
                arr[i] = temp % 10;
                temp /= 10;                            //传给数组
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] + 5;
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] % 10;
            }
            for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
                int x = arr[j];
                arr[j] = arr[i];
                arr[i] = x;
            }

            int temp2 = 0;
            for (int i = 0; i < arr.length; i++) {
                temp2 = temp2 * 10 + arr[i];
            }
            System.out.println(temp2);


          //还原
        for (int i = 0,j = arr.length -1; i < j; i++,j--) {
            int temp3 = arr[j];
            arr[j] = arr[i];
            arr[i] = temp3;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }
        int temp4 =0;
        for (int i = 0; i < arr.length; i++) {
            temp4 = temp4 * 10 + arr[i];
        }
        System.out.println(temp4);
    }
}



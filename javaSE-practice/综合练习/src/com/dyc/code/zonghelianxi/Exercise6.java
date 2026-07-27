package com.dyc.code.zonghelianxi;

import java.util.Random;
import java.util.Scanner;

//随机不重复抽奖
public class Exercise6 {
    public static void main(String[] args) {
        int [] arr = {2,588,888,1000,10000};
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("是否进行抽奖？(y/n)");
        char ch = sc.next().charAt(0);
        if (ch == 'y'){
            int count = 0;
            while (count < arr.length){
                int n =  random.nextInt(arr.length);
                if (arr[n] != 0){
                    System.out.println(arr[n] + "元的奖品已被抽出！");
                    arr[n] = 0;
                    count++;
                }
            }
        }


    }
}

package com.dyc.code.zonghelianxi;

import java.util.Random;

public class Exercise6_1 {
    public static void main(String[] args) {
        int [] arr = {2,333,555,355,777,988};
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int n = random.nextInt(arr.length);
            int temp = arr[n];
            arr[n] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "元奖品已经被抽出");
        }
    }
}

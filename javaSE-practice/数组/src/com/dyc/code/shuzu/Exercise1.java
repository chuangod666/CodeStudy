package com.dyc.code.shuzu;

import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
//求最值练习
        int [] arr = {1,231,512,566,23};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值是" + max);
//生成10个1~100间的数存入数组
//1.求和 2.求平均数 3.统计有多少个数比平均值小
        Random random = new Random();
        int [] arr1 = new int [10];
        for (int i = 0; i < arr1.length; i++) {
            int a = random.nextInt(101) + 1;
            arr1[i] = a;
        }
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println(sum);
        int average = sum / arr1.length;
        System.out.println("平均值是" + average);

        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < average) {
                count++;
            }
        }
        System.out.println("有" + count + "个数比平均值小");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }

    }
}

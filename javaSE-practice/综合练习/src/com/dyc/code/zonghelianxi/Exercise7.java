package com.dyc.code.zonghelianxi;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//双色球 6红（1~33）1蓝（1~16）
public class Exercise7 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] arr = new int[7];
        for (int i = 0; i < 6;) {
            int red = random.nextInt(33) + 1;
            boolean flag = contains(arr,red);          //自己定义的方法
            if(!flag){
                arr[i] = red;
                i++;
            }
        }
        int blue = random.nextInt(16) + 1;
        arr[6] = blue;

        System.out.println(Arrays.toString(arr));


    Scanner sc = new Scanner(System.in);
    //用户输入红球号码
        int[]arrUser = new int[7];
    for(int i = 0;i < 6;){
        System.out.println("请输入第" + (i + 1) +"个红球号码");
        int number = sc.nextInt();
        if(number >= 1 && number <= 33){
            boolean flag = contains(arrUser,number);
            if(!flag){
                arrUser[i] = number;
                i++;
            }
        }else {
            System.out.println("请输入正确的号码");
        }
    }
    //蓝球
        for (int j = 0;j < 1;){
            System.out.println("请输入蓝球号码");
            int number2 = sc.nextInt();
            if(number2 >= 1 && number2 <= 16){
                arrUser[6] = number2;
                j++;
            }else {
                System.out.println("请输入正确的号码");
            }
        }

        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arrUser.length - 1; i++) {         //红球中奖数
            for (int j = 0; j < arr.length -1; j++) {
                if(arrUser[i] == arr[j]){
                    count1++;
                    break;
                }
            }
        }

       int blueNumber = arrUser[6];
        if (blueNumber == arr[6]){
            count2++;
        }
       if(count1 ==6 && count2 ==1){
           System.out.println("恭喜你，中奖1000万");
       }else if(count1 ==6 && count2 ==0){
           System.out.println("恭喜你，中奖500万");
       }else if(count1 ==5 && count2 ==1){
           System.out.println("恭喜你，中奖3000");
       }else if((count1 ==5 && count2 ==0) || (count1 ==4 && count2 ==1)){
           System.out.println("恭喜你，中奖200");
       }else if((count1 ==4 && count2 ==0) || (count1 ==3 && count2 ==1)){
           System.out.println("恭喜你，中奖10");
       }else if(count1 ==2 && count2 ==1){
           System.out.println("恭喜你，中奖5");
       }else {
           System.out.println("谢谢参与");
       }

    }
    // 检查数组中是否包含某个数字
    public static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;  // 找到了
            }
        }
        return false;  // 没找到
    }

}

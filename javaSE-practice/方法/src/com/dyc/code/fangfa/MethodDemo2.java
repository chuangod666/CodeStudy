package com.dyc.code.fangfa;

import java.util.Arrays;

//注意基本数据类型和引用数据类型 1是真实数据的传递 2是地址值的传递
public class MethodDemo2 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法之前" + number);
        change(number);
        System.out.println("调用change方法之后" + number);
        int [] arr = {10,20,30};
        System.out.println("调用change111方法之前" + Arrays.toString(arr));
        change111(arr);
        System.out.println("调用change111方法之后" + Arrays.toString(arr));
    }
    public static void change(int a){
        a = 200;
    }
    public static void  change111(int []arr111){
        arr111 [1]= 200;
    }
}


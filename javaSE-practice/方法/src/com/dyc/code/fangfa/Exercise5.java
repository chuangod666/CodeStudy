package com.dyc.code.fangfa;
//设计一个方法求数组最大值并返回
public class Exercise5 {
    public static void main(String[] args) {
    int [] arr = {1,31,651,61,33};
    int a =getNum(arr);
    System.out.println("最大值是" + a);
    }
    public static int getNum(int [] arr){
        int max =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

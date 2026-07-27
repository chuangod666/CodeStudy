package com.dyc.code.fangfa;
//设计一个方法遍历数组，要求遍历结果在一行上
public class Exercise4 {
    public static void main(String[] args) {
        int[] arr = {11, 2, 33, 4, 54};
        number(arr);
    }

    public static void number(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + "， ");
            }

        }
    }
}
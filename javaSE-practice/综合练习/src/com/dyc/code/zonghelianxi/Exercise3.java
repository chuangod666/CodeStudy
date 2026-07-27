package com.dyc.code.zonghelianxi;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        int [] arr1 ={1,3,3,4,5,6};
        int [] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
          arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}

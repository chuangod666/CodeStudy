package com.dyc.code.shuzu;

import java.util.Random;

//交换数组中的数据，倒过来
public class Exercise2 {
    public static void main(String[] args) {
    int [] arr= {1,2,3,4,5};
    for(int i=0,j =arr.length - 1;i < j;i++,j--){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    for(int i =0;i < arr.length;i++){
        System.out.print(arr[i] + " ");
      }
//打乱数组中的数据
    int [] arr1 = {1,2,3,4,5};
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            int a = random.nextInt(arr1.length);
            int temp = arr1[i];
            arr1[i] = arr1[a];
            arr1[a] = temp;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

}

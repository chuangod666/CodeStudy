package com.dyc.code.shuzu;


public class ArrayDemo1 {
    public static void main(String[] args) {
//数组的静态初始化
    String [] arr1 = {"老鼠蟑螂","飞哥","鱼仔"};
    int [] arr2 = {1,29,23};
    double [] arr3 = {1.0,170.0,160.0};
    int number = arr2 [0];
        System.out.println(number);
        System.out.println(arr1[1]);
        arr1[1] = "十四";
        System.out.println(arr1[1]);
//遍历数组
        for (int i = 0;i < arr1.length;i++){
            System.out.println(arr1[i]);       //可以arr1.fori 直接生成遍历
        }
//遍历数组求和
        int [] arr = {1,3,14,323,55,55,11,23,5155,51562};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
//遍历数组统计1~10有几个数能被3整除
        int [] arr4 = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i = 0; i < arr4.length; i++) {
            if(arr4[i] % 3 == 0){
                count++;
            }
        }
        System.out.println(count);
//遍历数组奇数乘2，偶数除二 输出新数组（1~10）用上面的arr4
        for (int i = 0; i < arr4.length; i++) {
            if(arr4[i] % 2 == 1){
                arr4[i] = arr4[i] * 2;
            }
            else{
                arr4[i] = arr4[i] / 2;
            }
        }
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }
//数组的动态初始化
       int [] arr5 = new int[5];//默认初始化值会因为数据类型改变
        arr5[0] = 1;
    }
}
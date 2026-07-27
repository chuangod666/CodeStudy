package com.dyc.code.zifuchuan;

//调用方法将int数组拼接成字符串 第二种拼接成[1,2,3]样式
public class Exercise4 {
    public static void main(String[] args) {
    int [] arr = {1,2,3,4,5};
    stringSort(arr);
    arrToStr(arr);
        System.out.println(arrToStr(arr));
    }



    public static void stringSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d",arr[i]);
        }
        System.out.println();
    }
    public static String arrToStr(int[] arr){
        if(arr==null){
            return "";
        }
        if(arr.length==0){
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                result += arr[i]+"]";
            }else {
                result += arr[i]+",";
            }
        }
        return result;
    }
}

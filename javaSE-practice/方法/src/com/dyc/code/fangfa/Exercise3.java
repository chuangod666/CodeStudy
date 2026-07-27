package com.dyc.code.fangfa;
//重载比较两个整数是否相同 兼容全整数:byte short int long
public class Exercise3 {
    public static void main(String[] args) {
        if (compare(10000000,2111111111)){
            System.out.println("两个整数相同");
        }else {
            System.out.println("两个整数不同");
        }
    }


    public static boolean compare(int a,int b){
        return a==b;
    }
    public static boolean compare(byte a,byte b){
        return a==b;
    }
    public static boolean compare(short a,short b){
        return a==b;
    }
    public static boolean compare(long a,long b){
        return a==b;
    }
}

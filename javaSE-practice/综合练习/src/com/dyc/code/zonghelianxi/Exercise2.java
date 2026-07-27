package com.dyc.code.zonghelianxi;
//练习生成一个五位验证码前四位随机大小写字母，最后一位数字
//main里调用四个方法1一个方法2
//定义方1法把所有字母存在一个数组里，随机一个数返回这个数组
//定义方法2随机一个0~9的数返回


import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
    char n1 = getWord();
    char n2 = getWord();
    char n3 = getWord();
    char n4 = getWord();
    int n5 = getNum();
        System.out.print(" " + n1 + n2 + n3 + n4 + n5);
    }

    public static char getWord(){
        char[] arr = new char[52];
        for(int i=0;i<arr.length;i++){
           if(i <= 25){
               arr[i] = (char)(65+i);
           }else {
               arr[i] = (char)(97+i - 26);
           }
        }
        Random random=new Random();
        int word=random.nextInt(arr.length);
        return arr[word];
    }
    public static int getNum(){
       int a =new Random().nextInt(10);
       return a;
    }

}
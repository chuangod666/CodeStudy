package com.dyc.code.fangfa;
//基础的方法定义和调用
public class MethodDemo1 {
    public static void main(String[] args) {
     //调用方法
     playGame();
     playGame();//调用两次
     test();
    }
    //定义一个方法
    public static void playGame(){
        System.out.println("打开buff");
        System.out.println("查看每日商店");
        System.out.println("转瓦");
        System.out.println("寻找母瓦");
        System.out.println("辱骂瓦批");
        System.out.println("送人头");
    }
    public static  void test(){
        int a = 1,b =2;
        int sum = a+b;
        System.out.println(sum);
    }
}
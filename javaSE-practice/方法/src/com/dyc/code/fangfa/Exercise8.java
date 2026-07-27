package com.dyc.code.fangfa;
                               //字符串等于的用法.equals("")和sc进行运算时的用法sc.next类型()
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("这是一个机票价格查询系统");
        System.out.println("请输入机票价格");
        double a = sc.nextDouble();
        System.out.println("请输入月份");
        int b = sc.nextInt();
        sc.nextLine();               //这一步很重要消耗掉换行符 因为sc.nextInt只读取数字不读取换行符 nextLine之前要注意
        System.out.println("您要乘坐头等舱还是经济舱");
        String c = sc.nextLine();
        double money;
       if(b >= 5 && b <= 10){
           if(c.equals("头等舱")){
               money = a * 0.9;
           }else {
               money = a * 0.85;
           }
       }
       else{
           if(c.equals("头等舱")){
               money = a * 0.7;
           } else  {
               money = a * 0.65;
           }

       }
        System.out.println("机票价格：" + money + "元");
    }
}

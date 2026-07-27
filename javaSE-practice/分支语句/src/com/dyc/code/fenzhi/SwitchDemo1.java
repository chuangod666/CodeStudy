package com.dyc.code.fenzhi;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("蟑螂老鼠，李们想吃森莫嘞？");
        String str=sc.nextLine();
        switch (str) {
            case "火鸡面":
                System.out.println("ok吃火鸡面");
                break;
            case "兰州拉面":
                System.out.println("ok吃兰州拉面");
                break;
            case "板面":
                System.out.println("ok吃板儿面");
                break;
            default:
                System.out.println("李去吃狗大便吧");
                break;

        }
//小练习判断工作日休息日
        System.out.println("今天星期几？（输入数字）");
        int a =sc.nextInt();
        if (a>=1 && a<=5){
            System.out.println("今天是工作日");
        }
        else if (a == 6 || a == 7 ){
            System.out.println("今天是休息日");
        }
        else{
            System.out.println("没有这个星期");
        }
//用switch且用新写法和case穿透
        System.out.println("今天星期几？（输入数字）");
        int b =sc.nextInt();
        switch (b){
            case 1,2,3,4,5-> System.out.println("今天是工作日");
            case 6,7-> System.out.println("今天是休息日");
            default -> System.out.println("李在干森么？一个星期只有七天");
        }
//用户选择小练习
        System.out.println("请输入数字选择您要的服务：1.机票查询 2.机票预订 3.机票改签 4.退出服务");
        int s1 = sc.nextInt();
        switch (s1) {
            case 1-> System.out.println("机票查询");
            case 2-> System.out.println("机票预订");
            case 3-> System.out.println("机票改签");
            //case 4-> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }
    }
}

package com.dyc.code.yunsuanfu;
                             //这是一个读取各个数位的练习
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个五位数");
        int a = sc.nextInt();
        int ge = a % 10;
        int shi = a / 10 % 10;
        int bai = a / 100 % 10;
        int qian = a / 1000 % 10;
        int wan = a / 10000 % 10;
        //练习一下三种输出方法
        System.out.print("" + ge + shi + bai + qian + wan +"\n");
        //先用空字符串""开头，强制将后续 + 转为字符串拼接
        //\n 是一个转义字符，它代表换行符。但它不能单独写在代码里，必须放在双引号字符串内部才能被识别为换行

        System.out.println("个位是" + ge);
        System.out.println("十位是" + shi);
        System.out.println("百位是" + bai);
        System.out.println("千位是" + qian);
        System.out.println("万位是" + wan);


        System.out.printf("%d,%d,%d,%d,%d%n", ge, shi, bai, qian, wan);//%n为输出后换行
        System.out.printf("%d,%d,%d,%d,%d", ge, shi, bai, qian, wan);
         }

}

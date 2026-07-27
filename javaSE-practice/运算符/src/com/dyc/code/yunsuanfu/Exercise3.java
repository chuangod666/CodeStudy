package com.dyc.code.yunsuanfu;
                                //此页均为练习的可无视的警告
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
//基础运算
        System.out.println(1 + 2);
        System.out.println(1 - 2);
        System.out.println(3 * 2);
        System.out.println(10 / 3);
        System.out.println(10.0 / 3);
        System.out.println(10 % 3);
        System.out.println(10.0 % 3);      //整数得整数 小数得小数且可能不准
//自增自减
        int a = 10;
        int b = a++;
        int c = ++a;
        System.out.println(a + " " + b + " " + c);//12 10 12
//赋值运算符
        int d = 20;
        int e = 30;
        d += e;
        System.out.println(d);   //扩展赋值运算符隐含了强制转换
//关系运算符
        System.out.println(d == e);
        System.out.println(d >= e);

        //小练习 魅力值大于等于对方即成功
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的魅力值");
        int i = sc.nextInt();
        System.out.println("请输入对方的魅力值");
        int j = sc.nextInt();
        boolean result = i>j;
        System.out.println(result);

//逻辑运算符 & | ^ !
        System.out.println(true ^ true);
        System.out.println(true ^ false); //记忆点：同性不能结婚
//短路逻辑运算符 思考 &与&& |与||的区别：在于短路效果
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println(true && false);

        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || false);
        //小练习
        int m = 10;
        int n = 10;
        boolean result2 = ++m < 5 && ++n>5;
        System.out.println(result2);
        System.out.println(m);
        System.out.println(n);   //m=11 n=10体现了短路效果：后面不执行
//三元运算符
        int p = 10;
        int q = 20;
        int max = p > q ? p : q;
        System.out.println(max);       //输出了较大值20
        //小练习判断俩老虎体重是否相等
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入两只老虎的体重");
        int y = sc2.nextInt();
        int z = sc2.nextInt();
        System.out.println(y == z ? "体重相等" : "体重不等");
        //小练习判断三个和尚的最高
        int height1 = 165;
        int height2 = 150;
        int height3 = 210;
        int max2 = height1 > height2 ? height1 : height2;
        int max3 = height3 > max2 ? height3 : max2;
        System.out.println("最高的和尚有" + max3 + "厘米高"); //优先级分不清就拿括号括 括号优先级最高

    }
}



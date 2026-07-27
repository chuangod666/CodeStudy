package com.dyc.code.fenzhi;

import java.util.Scanner;
//这是几个if语句练习
public class IfDemo1 {
    public static void main(String[] args) {
        int ranking = 1;
        if (ranking == 1) {
            System.out.println("叫我第一名");
        }

//小练习去哪儿吃饭
            Scanner sc = new Scanner(System.in);
            System.out.println("你带了多少米米？");
            int money = sc.nextInt();
            if (money > 100) {
                System.out.println("去吃海鲜大餐");
            } else {
                System.out.println("吃沙县小吃吧");
            }


//小练习电影院分座位，100张票，奇数坐左边，偶右
        System.out.println("请输入你的票号");
        int num = sc.nextInt();
        if (num < 100 && num > 1) {       //满足票号要求
            if (num % 2 == 1) {
                System.out.println("您的座位在左半区");
            } else {
                System.out.println("您的座位在右半区");
            }

        } else {
            System.out.println("票号错误");
        }
//小练习：小明的考试奖励
        System.out.println("小明这次考了多少分？");
        int grade = sc.nextInt();
        if (grade >= 95 && grade <= 100) {
            System.out.println("小明得到了自行车");
        } else if (grade >= 90 && grade <= 94) {
            System.out.println("小明可以去游乐园玩一次");
        }
        else if (grade >= 80 && grade <= 89) {
            System.out.println("小明得到了一个“大黄蜂”");
        }
        else {
            System.out.println("no way！要挨打了！我们快逃逸！！");
        }
//会员价格判断，设买了十万美刀东西
        int total = 100000;
        System.out.println("请输入你的会员等级:0~3");
        int num2 = sc.nextInt();
        if (num2 == 1) {
            System.out.println("您需要支付" + (0.9 * 100000));
        }
        else if (num2 == 2) {
            System.out.println("您需要支付" + (0.8 * 100000));
        }
        else  if (num2 == 3) {
             System.out.println("您需要支付" + (0.7 * 100000));
        }
        else if (num2 == 0) {
            System.out.println("您需要支付" + 100000);
        }
    }
}

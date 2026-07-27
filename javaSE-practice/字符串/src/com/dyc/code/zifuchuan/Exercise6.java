package com.dyc.code.zifuchuan;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入一个金额");
            money = sc.nextInt();
            if(money >= 0 && money <= 9999999){
                break;
            }else {
                System.out.println("请输入正确的金额");
            }
        }

      String moneyStr = money + "";

        while (true) {
            int ge = money%10;
            String capitalNumber = getCapitalNumber(ge);
          moneyStr = capitalNumber + moneyStr;
            money = money/10;
            if(money == 0){
                break;
            }
        }
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr ;
        }
        System.out.println(moneyStr);
    }



    public static String getCapitalNumber(int number) {
        String [] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}

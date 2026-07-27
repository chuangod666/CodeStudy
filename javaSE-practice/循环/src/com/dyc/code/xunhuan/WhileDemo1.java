package com.dyc.code.xunhuan;

public class WhileDemo1 {
    public static void main(String[] args) {
        int i=1;
        while(i<=100){
            System.out.println(i);
            i++;
        }
//折纸0.1mm与珠穆朗玛峰8844430mm
        double a = 0.1;
        double b = 8844430;
        int sum = 0;
        while(a < b){
            a = a*2;
            sum ++;
        }
        System.out.println(sum);

    }
}

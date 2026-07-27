package com.dyc.code.zonghelianxi;

//判断101~200间有多少质数并输出
public class Exercise1 {
    public static void main(String[] args) {
        int count=0;
        for(int a=101;a<=200;a++) {
            boolean prime = true;
         for(int b=2;b<=a/2;b++) {
         if(a%b==0){
            prime=false;
            break;
         }
         }
         if(prime){
             System.out.println(a);
             count++;

         }

        }
        System.out.println("101~200间有" + count + "个质数");
    }
}

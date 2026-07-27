package com.dyc.code.yunsuanfu;
                                    //强制转换
public class Exercise2 {
    public static void main(String[] args) {
        byte a = 100;
        byte b = 100;
        byte result =(byte) (a + b);
        System.out.println(result);     //这里会出现错误超过byte范围
    }
}

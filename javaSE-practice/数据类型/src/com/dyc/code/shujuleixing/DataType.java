package com.dyc.code.shujuleixing;

public class DataType {        //类名用拼音没问题但会报错很恶心
    public static void main(String[] args) {
        byte a = 11;
        short b = 123;
        int c = 6657;
        long d = 1234567890L;//long末尾加个L
        float e = 131511.12F;//float末尾加个F
        double f = 1234213.12131;
        char g = '坤';
        boolean h = true;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h);
        //注意以下两点
        //8个基本数据类型 其取值范围
        //末尾的L和F

        //小练习输出个人信息
        String name = "蔡徐坤";
        int age = 26;
        char sex = '男';
        int height = 188;
        boolean danshen = true;
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex + " " + height + " " + danshen);

    }

}


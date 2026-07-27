package com.dyc.code.zifuchuan;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1);

        String s2 = new String();
        System.out.println("dashabi" + s2 + "kkkk");

        String s3 = new String("cook");
        System.out.println(s3);

        char[] chs = {'a','2','3','1','s'};
        String s4 = new String(chs);
        System.out.println(chs);
        System.out.println(s4);

        byte [] bytes = {97,98,99,100};
        String s5 = new String(bytes);
        System.out.println(bytes);        //注意
        System.out.println(s5);

        String s6 = new String("ukpkmkk");
        String s7 = "ukpkmkk";

        System.out.println(s6 == s7);

        boolean result = s6.equals(s7);
        System.out.println(result);

        boolean result1 = s6.equalsIgnoreCase(s7); //忽略大小写
        System.out.println(result1);
    }

}

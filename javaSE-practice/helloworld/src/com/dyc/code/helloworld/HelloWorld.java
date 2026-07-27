package com.dyc.code.helloworld;

public class HelloWorld {
    public static void main(String[]args){
        System.out.println("hello world");//基础输出
        System.out.println("迪克胡迪克");//字符串
        System.out.println('z');//字符
        System.out.println(666);//整数类型
        System.out.println(-9.9);//小数类型
        System.out.println(true);//布尔类型
        System.out.println("null");//空类型,此处因null不能直接打印加的双引号
        System.out.println("姓名" + '\t' + "董裕川");
        System.out.println("性别" + '\t' + "男性");//制表符\t是把字符串长度补到8，使得输出对得齐

        //下为变量
        int a = 4396;
        System.out.println(a + 10);//输出4406执行了加法
        System.out.println(a + "10");//输出439610
        a = 1557;//这将改变a的值
        System.out.println(a);
        System.out.println(a + 10);
        double b = 1.1,c = 2.2,d = 3.3;
        System.out.println(b + c + d +" " + b + " " + c + " " + d);//这里出过错我用逗号分隔了，println方法只能接收一个参数
        //小练习上下公交车
        int count = 0;
        count = count + 1;
        count = count + 2 -1;
        count = count + 2 -1;
        count = count - 1;
        count = count + 1;
        System.out.println("公交车上还有" + count + "人。");
        //二进制以0b开头，十进制无前缀，八进制以0开头，十六进制以0x开头（注意各进制内所含数字）
    }

}
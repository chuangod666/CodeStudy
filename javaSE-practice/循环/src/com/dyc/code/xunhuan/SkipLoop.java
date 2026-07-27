package com.dyc.code.xunhuan;

public class SkipLoop  {
    public static void main(String[] args) {
        for (int a = 1; a <= 5;a ++) {
        if (a == 3){
            continue;
        }
            System.out.println("小老虎在吃第" + a + "个包子");//第三个包子有虫不吃
        }
        for (int b = 1; b <= 5;b ++){                      //吃到第三个不吃了
            System.out.println("小老虎在吃第" + b + "个包子");//注意输出语句的位置
            if (b ==3){
                break;
            }
        }
    }
}

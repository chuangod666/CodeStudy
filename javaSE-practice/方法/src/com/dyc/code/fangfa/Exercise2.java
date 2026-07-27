package com.dyc.code.fangfa;
//定义方法比较两个长方形面积
public class Exercise2 {
    public static void main(String[] args) {
    double area1 = getArea(10.0,20.0);
    double area2 = getArea(20.0,20.0);
    if(area1>area2){
        System.out.println("第一个长方形更大");
    }
    else if(area1<area2){
        System.out.println("第二个长方形更大");
    }
    else{
        System.out.println("两个长方形一样大");
    }
    }
    public static double getArea(double a,double b){
        return a * b;
    }
}

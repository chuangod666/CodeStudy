package com.dyc.code.fangfa;
//带参数方法的定义和调用
public class Exercise1 {
    public static void main(String[] args) {
      getSum(3,3);                        //实参
      getLength(3.2,6.2);
      getArea(1.5);


      int sum = getSum1(10,20);      //赋值调用
        System.out.println(sum);
        System.out.println(getSum1(1,2));  //输出调用
}
    public static void getSum(int a,int b){     //形参
        int sum = a+b;
        System.out.println(sum);
    }
    public static void getLength(double a,double b){
        double result = ( a + b ) * 2;
        System.out.println(result);
    }
    public static void getArea(double r){
        double result = 3.14 * r * r;
        System.out.println(result);
    }
//带返回值方法的定义和调用  直接调用 一般用赋值调用
    public static int getSum1(int a,int b){
        int sum = a + b;
        return sum;       //可以直接return a + b;
    }
}

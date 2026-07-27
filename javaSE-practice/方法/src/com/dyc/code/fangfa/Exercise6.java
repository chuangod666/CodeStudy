package com.dyc.code.fangfa;
//定义一个方法判断数组中是否存在某数，将结果返回给调用处
public class Exercise6 {
    public static void main(String[] args) {
     int a = 2;
     int [] arr = {1,3,41,41,55};
     boolean f = exist(arr,a);
     if(f){
         System.out.println("数组中存在数字" + a);
     }else {
         System.out.println("数组中不存在数字" + a);
     }
    }
    public static boolean exist(int []arr,int x){

        for (int i = 0; i < arr.length; i++) {
          if(x == arr[i]){
              return true;
          }
        }
      return false;
    }
}

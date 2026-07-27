package com.dyc.code.fangfa;

import java.util.Arrays;

//定义一个方法copyOfRange(int[] arr,int from,int to)
//从索引from到to复制到新数组中并返回新数组 包含from不包含to
public class Exercise7 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int from = 3;
        int to = 7;
        int [] arr333 = copyOfRange(arr, from, to);
        System.out.println(Arrays.toString(arr333));
    }
    public static int[] copyOfRange(int[] arr111,int from,int to){
        int [] arr222 = new int [to - from];//新数组大小为4
        for (int i = from; i < to; i++) {     //这里不能套循环，会全覆盖
           arr222[i - from] = arr111[i];     //可以伪造索引定义index =0；然后index++
        }
       return arr222;
    }
}

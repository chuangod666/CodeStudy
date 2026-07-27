package com.dyc.code.jihe;

public class StringBuilder2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        String a = setString(arr);
        System.out.println(a);
    }


    public static String setString(int [] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                sb.append(arr[i] + ",");
            }else{
                sb.append(arr[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }

}

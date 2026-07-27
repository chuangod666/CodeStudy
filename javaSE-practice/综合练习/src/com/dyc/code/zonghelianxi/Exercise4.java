package com.dyc.code.zonghelianxi;
//评委打分

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
     double scores [] = getScores();
     double max = max(scores);
     double min = min(scores);
     double result = jisuan(max,min,scores);
        System.out.println("最终成绩是" + result);
    }

    public static double [] getScores(){
        double [] scores = new double [6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; )
        {
            System.out.println("请输入成绩");
            double score = sc.nextDouble();
            if(score >= 0 && score <= 100)
            {
                scores[i] = score;
                i++;
            }
        }
        return scores;
    }
    public static double max(double[] arr){
        double max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
       return max;
    }
    public static double min(double[] arr){
        double min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static double jisuan(double max,double min,double []arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        double sum1 = (sum - max - min)/4;
        return sum1;
    }
}

package com.dyc.code.shuzu;

//二维数组的动态初始化和遍历（静态略）
public class ArrayDemo2 {
    public static void main(String[] args) {
        int [][]arr = new int[3][4];
        arr[0][0] = 67;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int [][]arr2 = new int[2][];
        int []arr3 ={1,2,3};
        int []arr4 ={4,5,6};
        arr2[0] = arr3;
        arr2[1] = arr4;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        //小练习计算季度和全年营业额
        int[][] arr5= new int [4][];
        int []arr6 = {22,66,44};
        int []arr7 ={77,33,88};
        int []arr8 ={24,45,65};
        int []arr9 ={11,66,99};
        arr5[0] = arr6;
        arr5[1] = arr7;
        arr5[2] = arr8;
        arr5[3] = arr9;

        int sum1 = 0;
        for (int i = 0; i < arr5.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr5[i].length; j++) {
                sum += arr5[i][j];
                sum1 += arr5[i][j];
            }
            System.out.println("第" + i + "季度的营业额是" + sum);
        }
        System.out.println("全年的营业额是" + sum1);
    }
}

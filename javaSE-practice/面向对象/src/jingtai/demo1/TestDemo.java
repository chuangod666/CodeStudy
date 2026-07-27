package jingtai.demo1;

public class TestDemo {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);


        double[] arr2 = {1.2,2.11,3.3,2.4,4.5};
        double str1 = ArrayUtil.getAverage(arr2);
        System.out.println(str1);
    }
}

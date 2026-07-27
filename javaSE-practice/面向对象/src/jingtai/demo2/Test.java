package jingtai.demo2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("张三", "男",23);
        Student s2 = new Student("李四", "女",32);
        Student s3 = new Student("王五", "男",51);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int a = StudentUtil.getMaxAgeStudent(list);
        System.out.println(a);
    }
}

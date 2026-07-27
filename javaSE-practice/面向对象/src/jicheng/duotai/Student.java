package jicheng.duotai;

public class Student extends Person {
    @Override
    public void getMessage() {
        System.out.println(getName() + "的信息为:" + "," + getAge());
    }
}

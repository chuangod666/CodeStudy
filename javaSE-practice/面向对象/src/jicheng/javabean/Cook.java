package jicheng.javabean;

public class Cook extends Employee{
    public Cook() {
    }

    public Cook(int id, int salary, String name) {
        super(id, salary, name);
    }



    @Override
    public void work() {
        System.out.println("大厨炒菜中");
    }
}

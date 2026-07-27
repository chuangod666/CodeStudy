package jicheng.javabean;

public class Employee {
    private  int id;
    private  String name;
    private  int salary;

    public Employee() {
    }

    public Employee(int id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("吃米饭");
    }

    public void work(){
        System.out.println("正在工作");
    }
}

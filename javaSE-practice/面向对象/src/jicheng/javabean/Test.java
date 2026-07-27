package jicheng.javabean;

public class Test {
    public static void main(String[] args) {
        Manager a = new Manager(1,1500,"小李",500);
        System.out.println(a.getId() +a.getName() + "拿了" + a.getSalary() + "工资和" + a.getBonus() + "奖金");


        Cook b = new Cook();
        b.setName("老王");
        b.setSalary(50000);
        b.setId(2);
        System.out.println(b.getId() +b.getName() + "拿了" + b.getSalary() + "工资");
    }
}

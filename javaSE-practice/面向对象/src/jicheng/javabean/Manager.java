package jicheng.javabean;

public class Manager extends Employee{
    private int bonus;

    public Manager() {

    }

    public Manager(int id, int salary, String name, int bonus) {
        super(id, salary, name);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}

package jichu;
//无参和带参构造方法 set可不要
public class Gouzao {
    public Gouzao() {}
    public Gouzao(String name,int age) {
        this.name = name;
        this.age = age;
    }
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    private int age;
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

}

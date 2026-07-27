package jichu;

public class GirlFriend {
    private String name;
    public void setName(String name) {
        this.name = name;
        //涉及就近原则和this方法 区分成员变量和局部变量
    }
    public String getName() {
        return name;
    }

    private int age;
    public void setAge(int age) {
        if(age >= 18 && age <= 25) {
            this.age = age;
        }else{
            System.out.println("非法数据");
        }
    }
    public int  getAge() {
        return age;
    }

    private String gender;
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    public void call(){
        System.out.println("女朋友在打电话");
    }
    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
}

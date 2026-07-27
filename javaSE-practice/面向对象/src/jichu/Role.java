package jichu;
                    //这个只做了很基础的部分
import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法攻击别人
    //思考谁攻击谁：方法调用者去攻击参数
    //Role r1 = new Role;
    //Role r2 = new Role;
    public void attack(Role role){
        Random damage = new Random();
        int random = damage.nextInt(41) + 20; //20~60
        int remainBlood = role.getBlood() - random;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);
        System.out.println(this.getName() + "对" + role.getName() +"挥了一拳，造成了" + random +"点伤害，" + role.getName() + "还剩下" + remainBlood +"点血");

    }
}

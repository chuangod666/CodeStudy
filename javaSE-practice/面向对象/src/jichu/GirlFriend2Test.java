package jichu;
//计算平均年龄并把低于平均年龄的人的所有信息都打出来
public class GirlFriend2Test {
    public static void main(String[] args) {
        GirlFriend2 []arr = new GirlFriend2[4];
        GirlFriend2 p1 = new GirlFriend2("牧濑红莉栖",22,'女',"睡觉");
        GirlFriend2 p2 = new GirlFriend2("椎名真有里",21,'女',"吃炸鸡");
        GirlFriend2 p3 = new GirlFriend2("忍野忍",3200,'女',"吃甜甜圈");
        GirlFriend2 p4 = new GirlFriend2("战场原黑仪",22,'女',"玩圆规");
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        arr[3] = p4;
       int sum = 0;
       int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend2 p = arr[i];
             sum = sum + p.getAge();
             sum = sum / arr.length;       //求得平均年龄
        }
        System.out.println("女朋友的平均年龄是" + sum);
        for (int i = 0; i < arr.length; i++) {
            GirlFriend2 p = arr[i];
            if(p.getAge() < sum){
                System.out.println(p.getName() + " " + p.getAge() + " " + p.getGender() + " " + p.getHobby());
                count++;
            }
        }
        System.out.println("比平均年龄小的女朋友有" + count +"个");
    }
}

package jichu;

public class Phone2Test {
    public static void main(String[] args) {
        Phone2 []arr = new Phone2[3];
        Phone2 p1 = new Phone2("小米",1999, "白色");
        Phone2 p2 = new Phone2("华为",3999, "黑色");
        Phone2 p3 = new Phone2("苹果",11999, "蓝色");
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        Phone2 phone = arr[i];
        sum =sum + phone.getPrice();
        }
        sum = sum / arr.length;
        System.out.println("手机均价是" + sum);

    }
}

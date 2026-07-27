package jichu;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
    Car []car = new Car[3];//创建一个数组用来存三个汽车对象
    Scanner sc = new Scanner(System.in);
        for (int i = 0; i < car.length; i++) {
            Car c = new Car();
            System.out.println("请输入汽车的品牌");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入汽车的价格");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入汽车的颜色");
            String color = sc.next();
            c.setColor(color);
            car[i] = c;
        }
        for (int i = 0; i < car.length; i++) {
            Car car1 = car[i];
            System.out.println(car1.getBrand() + " " + car1.getColor() + " " + car1.getPrice());
        }
    }
}

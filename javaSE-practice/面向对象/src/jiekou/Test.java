package jiekou;

public class Test {
    public static void main(String[] args) {

        Frog frog = new Frog("蛙蛙",2);
        System.out.println(frog.getName() + "今年" + frog.getAge() + "岁");
        frog.eat();
        frog.swim();

        animalIsEat(new Frog());
        animalIsEat(new Dog());

    }

    //下面加个多态练习一下

    public static void animalIsEat(Animal animal) {
        animal.eat();
    }
}


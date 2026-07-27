package chouxianglei;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("dyc",23);
        f.eat();
        Dog d = new Dog("gcy",22);
        d.eat();
        d.drink();
        Sheep s = new Sheep();
        s.eat();
    }
}

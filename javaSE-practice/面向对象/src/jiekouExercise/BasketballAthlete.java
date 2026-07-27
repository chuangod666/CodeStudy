package jiekouExercise;

public class BasketballAthlete extends Athlete{
    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    public BasketballAthlete() {
    }

    @Override
    public void study() {
        System.out.println("学打篮球");
    }
}

package jiekouExercise;

public class TableTennisAthlete extends Athlete implements EnglishStudy{


    public TableTennisAthlete() {
    }

    public TableTennisAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void englishStudy() {
        System.out.println("乒乓球运动员在学英语");
    }
}

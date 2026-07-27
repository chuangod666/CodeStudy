package jiekouExercise;

public class TableTennisCoach extends Coach implements EnglishStudy{
    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    public TableTennisCoach() {
    }

    @Override
    public void englishStudy() {
        System.out.println("乒乓球教练在学英语");
    }

    @Override
    public void teach(){
        System.out.println("乒乓球教练教学中");
    }
}

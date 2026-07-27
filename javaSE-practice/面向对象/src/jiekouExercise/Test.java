package jiekouExercise;

public class Test {
    public static void main(String[] args) {
        TableTennisAthlete a = new TableTennisAthlete("董裕川",22);
        System.out.print(a.getAge() +"的" + a.getName());
        a.englishStudy();
        athleteIsPractising(new TableTennisAthlete());


        coachIsTeaching(new BasketballCoach());
    }

    public static void coachIsTeaching(Coach coach){
        coach.teach();
    }


    public static void athleteIsPractising(Athlete athlete) {
        athlete.study();
    }
}

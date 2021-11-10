package interface4;

public class TableTennisCoach extends Coach implements SpeakEnglish {
    public TableTennisCoach() {
    }

    public TableTennisCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void speak() {
        System.out.println("会说");
    }

    @Override
    public void eat() {
        System.out.println("一般般");

    }

    @Override
    public void teach() {
        System.out.println("不会");
    }
}

package interface4;

public class TableTennisPlayer extends Athlete implements SpeakEnglish {


    public TableTennisPlayer() {
    }

    public TableTennisPlayer(int age, String name) {
        super(age, name);
    }

    @Override
    public void speak() {
        System.out.println("balabala");
    }

    @Override
    public void study() {
        System.out.println("不学");

    }

    @Override
    public void eat() {
        System.out.println("龙虾鲍鱼 ");

    }
}

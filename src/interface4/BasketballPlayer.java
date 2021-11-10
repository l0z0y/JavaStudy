package interface4;

public class BasketballPlayer extends Athlete implements SpeakEnglish {

    public BasketballPlayer() {
    }

    public BasketballPlayer(int age, String name) {
        super(age, name);
    }

    @Override
    public void study() {
        System.out.println("天天学");
    }

    @Override
    public void speak() {
        System.out.println("很会说");

    }

    @Override
    public void eat() {
        System.out.println("大鱼大肉");

    }
}

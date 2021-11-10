package interface4;

public class BasketballCoach extends Coach implements SpeakEnglish {

    public BasketballCoach() {
    }

    public BasketballCoach(int age, String name) {
        super(age, name);
    }



    @Override
    public void eat() {
        System.out.println("吃点好的 ");
    }

    @Override
    public void teach() {
        System.out.println("不会教");
    }

    @Override
    public void speak() {
        System.out.println("根本不会");

    }
}

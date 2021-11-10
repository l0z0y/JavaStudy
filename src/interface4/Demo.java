package interface4;

/**
 * @author li'zi'yao
 */
public class Demo {
    public static void main(String[] args) {
        BasketballCoach a = new BasketballCoach();

        a.setAge(55);
        a.setName("王明");
        System.out.println(a.getAge() + "\t" + a.getName());
        a.teach();
        a.eat();
        a.speak();

        System.out.println();

        BasketballPlayer b = new BasketballPlayer(21, "李好");
        System.out.println(b.getAge() + "\t" + b.getName());
        b.study();
        b.eat();
        b.speak();

        System.out.println();

        TableTennisCoach t = new TableTennisCoach(45, "马龙");
        System.out.println(t.getAge() + "\t" + t.getName());
        t.teach();
        t.eat();
        t.speak();

        System.out.println();

        TableTennisPlayer z = new TableTennisPlayer();
        z.setName("张继科");
        z.setAge(22);
        System.out.println(z.getAge() + "\t" + z.getName());
        z.study();
        z.eat();
        z.speak();

    }
}

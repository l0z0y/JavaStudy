package returnvalue3;

public class Demo3 {
    public static void main(String[] args) {
        Operate j = new Operate();
        Jumpping c  = new Cat();
        j.useJumppin(c);

        Jumpping jum = j.getJum();
        jum.jump();
    }
}

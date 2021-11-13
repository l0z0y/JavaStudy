package Lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        Swimming s = new Swimming();
        s.go(() -> System.out.println("oooo"));
        s.go(() -> System.out.println("zzzz"));
    }
}

package humanity;

/**
 * @author li'zi'yao
 */
public class Student extends People {

    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }

    public void studying() {
        System.out.println("study");
    }

}

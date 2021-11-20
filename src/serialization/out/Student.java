package serialization.out;

import java.io.Serializable;

/**
 * @author li'zi'yao
 */
public class Student implements Serializable {
    private String name;
    private int age;
    private  int garden;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", garden=" + garden +
                '}';
    }

    public Student(String name, int age, int garden) {
        this.name = name;
        this.age = age;
        this.garden = garden;
    }
}

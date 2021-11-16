package setList.hash.hashrepeat;

public class Student {
    private String name ;
    private int age ;
    private int garde ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (garde != student.garde) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + garde;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", garde=" + garde +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age, int garde) {
        this.name = name;
        this.age = age;
        this.garde = garde;
    }
}

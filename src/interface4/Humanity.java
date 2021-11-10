package interface4;

/**
 * @author li'zi'yao
 */
public abstract class Humanity {
    private int age;
    private String name;

    public Humanity() {
    }

    public Humanity(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();
}

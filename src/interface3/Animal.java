package interface3;

/**
 * @author li'zi'yao
 */
public abstract class Animal  {
    private int age;
    private String name;

    public Animal() {
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
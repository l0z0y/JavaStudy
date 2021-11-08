package staticmember;

/**
 * @author li'zi'yao
 */
public class Student {

    public String name;
    public int age;

    /**
     * 被所有的对象共享
     */
    public static String school;

    public void show() {
        System.out.println(name + "\t" + age + "\t" + school);
    }
}

package object.equals;

/**
 * @author li'zi'yao
 */
public class EqualsDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("lzy");
        s.setAge(22);

        Student s1 = new Student("lzy", 22);

        // 比较的是 s s1 的地址值
        System.out.println(s == s1);
        System.out.println();

        System.out.println(s.equals(s1));

    }


}

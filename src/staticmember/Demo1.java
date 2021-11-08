package staticmember;

/**
 * @author li'zi'yao
 */

public class Demo1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.age = 123;
        s1.name = "qwe";
        Student.school = "zzzz";


        s1.show();

        //不应该通过类实例访问静态成员
        // 可以通过类名调用,也可以通过对象名调用----推荐使用类名调用
//      s2.school="asdasd";
        s2.age = 234;
        s2.name = "zxczxc";
        s2.show();

    }
}

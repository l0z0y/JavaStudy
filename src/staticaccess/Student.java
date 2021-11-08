package staticaccess;

/**
 * @author li'zi'yao
 */
public class Student {

    /**
     * 静态成员变量
     */
    private static String school = "zzzz";

    /**
     * 非静态成员变量
     */
    private String name = "qweqwe";

    /**
     * 静态成员方法
     */
    public static void show1() {
        //无法访问非静态的成员变量
//      System.out.println(name);
        System.out.println(school);
        //无法调用非静态方法
//      show();
        show2();

    }

    /**
     * 静态成员方法
     */
    public static void show2() {

    }

    /**
     * 非静态成员方法
     */
    public void show() {
        //能访问静态的成员方法以及静态成员变量
        System.out.println(name);
        System.out.println(school);
        show1();

    }


}

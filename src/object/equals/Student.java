package object.equals;

/**
 * @author li'zi'yao
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        /*
            this -- s
            o    -- s1
         */
        //比较地址是否相同 相同返回ture
        if (this == o) {
            return true;
        }
        /*
            判断参数是否为空
            判断两个对象是否来自同一个类
        */
        //参数为 null 或 两个对象不是同一个类 返回false
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        //向下转型
        //student  = s2
        Student student = (Student) o;

        //比较 age 是否相同
        if (age != student.age) {
            return false;
        }
        // 比较姓名内容是否相同
        return name != null ? name.equals(student.name) : student.name == null;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

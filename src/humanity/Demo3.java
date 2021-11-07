package humanity;

/**
 * @author li'zi'yao
 */
public class Demo3 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setAge(15);
        t.setName("qwe");
        System.out.println(t.getAge() + " " + t.getName());
        t.teach();

        Teacher t2 = new Teacher("qweasd", 15);
        System.out.println(t2.getAge() + " " + t2.getName());
        t2.teach();


        Student st = new Student();
        st.setName("zxczxc");
        st.setAge(20);
        System.out.println(st.getAge() + " " + st.getName());
        st.studying();

        Student st2 = new Student("asd", 30);
        System.out.println(st2.getAge()+" "+st2.getName() );
        st2.studying();
    }
}

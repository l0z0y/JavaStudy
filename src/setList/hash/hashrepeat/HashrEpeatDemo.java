package setList.hash.hashrepeat;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author li'zi'yao
 */
public class HashrEpeatDemo {
    public static void main(String[] args) {
        Set<Student> st = new HashSet<>();
        st.add(new Student("zzz",15,20));
        st.add(new Student("zz",15,20));
        st.add(new Student("zz",15,20));
        st.add(new Student("zzzz",11,20));
        st.add(new Student("zzzz",11,20));

        System.out.println(st);
        for (Student student : st) {
            System.out.println(student);
        }



    }
}

package arraylist.studentTraversal;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<StudentInformation> list =   new ArrayList<>();

        //创建学生对象
        StudentInformation st1= new StudentInformation(123123,"lazss");
        StudentInformation st2= new StudentInformation(123122,"asdf");
        StudentInformation st3= new StudentInformation(123123,"qwer");

        //添加学生对象到集合
        list.add(st1);
        list.add(st2);
        list.add(st3);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            StudentInformation s = list.get(i);
            System.out.println(s.getId()+" "+s.getName());

        }
    }


}

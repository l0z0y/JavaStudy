package Arrary.customSort;

import java.util.Arrays;
import java.util.Comparator;

public class CustomSortDemo {
    public static void main(String[] args) {
        // sort 默认升序排序
        int[] arr = {1231, 2, 1, 2, 12, 4, 8, 4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println();
        //自定义比较器对象，只能支持引用类型的排序
        Integer[] arr1 = {1231, 2, 1, 2, 12, 4, 8, 4};
        /**
         * 参数一 排序的数组必须是引用类型的元素
         * 参数二 匿名内部类对象，代表了一个比较器对象
         */

        Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //默认升序
//                return o1 - o2;
                //降序
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr1));


        System.out.println();
        Student [] student =new Student[3];
        student[0]=new Student(15,"lzy",177.2);
        student[1]=new Student(19,"lzx",167.2);
        student[2]=new Student(12,"lzz",197.2);
        System.out.println(Arrays.toString(student));
        Arrays.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //升序
//                return o1.getAge()- o2.getAge();
                //降序
//                return o2.getAge()-o1.getAge();
                //比较 double类型只能用Double.compare(double 1 ,double2)
                //double 1 小于double 2 返回值为1 大于则为-1
                return Double.compare(o1.getHeight() ,o2.getHeight());
            }
        });
        System.out.println(Arrays.toString(student));


    }
}

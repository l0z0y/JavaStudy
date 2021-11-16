package streammethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * 目标：Stream流的常用API
 * forEach : 逐一处理(遍历)
 * count：统计个数
 * -- long count();
 * filter : 过滤元素
 * -- Stream<T> filter(Predicate<? super T> predicate)
 * limit : 取前几个元素
 * skip : 跳过前几个
 * map : 加工方法
 * concat : 合并流。
 *
 * @author li'zi'yao
 */
public class StreamDemo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张三丰");

        //forEach : 逐一处理(遍历)
        list.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();

        //count：统计个数 -- long count();
        long count = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(count);

        // 过滤
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.print(s + " "));
        System.out.println();

        //limit : 取前几个元素
        list.stream().limit(2).forEach(s -> System.out.print(s + " "));
        System.out.println();

        //skip : 跳过前几个
        list.stream().skip(2).forEach(s -> System.out.print(s + " "));
        System.out.println();

        // map加工方法: 第一个参数原材料  -> 第二个参数是加工后的结果。
        // 给集合元素的前面都加上一个：zz
        list.stream().map(s -> "zz" + s).forEach(s-> System.out.print(s+" "));
        System.out.println();

        // 需求：把所有的名称 都加工成一个学生对象。
        list.stream().map(s->new Student(s)).forEach(s-> System.out.print(s + " "));
//        list.stream().map(Student::new).forEach(System.out::println);
        System.out.println();
        // 合并流。
        Stream<String> s1 =list.stream().filter(s->s.startsWith("张"));
        Stream<String> s2 =Stream.of("java","zzz");
        Stream<String> s3 =Stream.concat(s1,s2);
        s3.forEach(s-> System.out.print(s+" "));

        System.out.println();
        // distinct()
        list.stream().distinct().forEach(s-> System.out.print(s+" "));




    }
}

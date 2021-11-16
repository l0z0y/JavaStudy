package collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author li'zi'yao
 */
public class Collect {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");

        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        List<String> zhangList = s1.collect(Collectors.toList());
        System.out.println(zhangList);

        Stream<String> s2 = list.stream().filter(s -> s.startsWith("张"));
//        String[]arr = s2.toArray(value ->new String[value]); ;
        Object[] arr = s2.toArray();
        System.out.println(Arrays.toString(arr));


    }
}

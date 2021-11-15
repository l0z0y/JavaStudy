package traverse.iteration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IterationDemo {
    public static void main(String[] args) {
        Collection<String> s = new ArrayList<>();
        s.add("lzy");
        s.add("lzz");
        s.add("lzx");
        s.add("lzc");
        s.add("lzv");
        System.out.println(s);


        //Iterator<String> it  = s.iterator() 得到当前集合的迭代器对象
        Iterator<String> it = s.iterator();

        // 用while循环遍历 it.hasNext()
        // 询问当前位置是否有元素存在，存在返回true ,不存在返回false
        // 再用it.next 取出元素
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();
        System.out.println(s);

    }
}

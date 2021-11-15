package traverse.iteration.delete;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author li'zi'yao
 */
public class DeleteDemo {
    public static void main(String[] args) {
        Collection<String> s = new ArrayList<>();
        s.add("lzy");
        s.add("lzz");
        s.add("lzz");
        s.add("lzx");
        s.add("lzc");
        s.add("lzv");
        System.out.println(s);

        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String z = it.next();
            if ("lzz".equals(z)) {
                //报错
                //                s.remove("lzz");
                //使用迭代器删除当前位置的元素，保证不后移，能够成功遍历到全部元素
                it.remove();
            }

        }
        System.out.println(s);
    }
    }


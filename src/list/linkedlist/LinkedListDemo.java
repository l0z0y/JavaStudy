package list.linkedlist;

import java.util.LinkedList;

/**
 * @author li'zi'yao
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList <String> s = new LinkedList<>();
        s.add("lzy");
        s.add("lzz");
        s.add("lzx");
        s.add("lzc");
        s.add("lzv");
        System.out.println(s);

        System.out.println();
        s.addFirst("zzz");
        s.addLast("ssss");
        System.out.println(s);
        System.out.println(s.getLast());
        System.out.println(s.getFirst());
        System.out.println();
        System.out.println(s.removeFirst());
        System.out.println(s);
        System.out.println(s.removeLast());
        System.out.println(s);





    }
}

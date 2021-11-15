package traverse.forpro.delete;

import java.util.ArrayList;
import java.util.List;

/**
 * @author li'zi'yao
 */
public class DeleteDemo {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("lzy");
        s.add("lzz");
        s.add("lzz");
        s.add("lzx");
        s.add("lzc");
        s.add("lzv");
        System.out.println(s);

//        for (String s1 : s) {
//            if ("lzz".equals(s1)) {
//                //报错
////                s.remove("lzz");
//            }
//
//        }
//        for (int i = s.size()-1; i >=0; i--) {
//
//            if (s.get(i).equals("lzz")) {
//
//                s.remove("lzz");
//            }
//
//        }
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).equals("lzz")) {

                s.remove("lzz");
                i--;

            }
        }
        System.out.println(s);
    }
}


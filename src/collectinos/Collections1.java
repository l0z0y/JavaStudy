package collectinos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author li'zi'yao
 */
public class Collections1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        Collections.addAll(list, "aaaaa", "aaaaaz", "lzy");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

        List<Integer> in = new ArrayList<>();
        Collections.addAll(in, 20, 22, 88, 1, 20);

        Collections.sort(in, ( o1,  o2)-> o1-o2<=0?1:-1);
        System.out.println(in);

    }


}



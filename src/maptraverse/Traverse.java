package maptraverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author li'zi'yao
 */
public class Traverse {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("nike", 111);
        map.put("sss", 1);
        map.put("vvv", 111);
        map.put("sss", 111);
        map.put("zzz", 111);
        System.out.println(map);

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(map.get(key));
        }

        map.forEach((s, integer) -> System.out.println(s + " " + integer));

    }
}

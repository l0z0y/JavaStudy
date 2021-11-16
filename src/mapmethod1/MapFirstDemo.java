package mapmethod1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author li'zi'yao
 */
public class MapFirstDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("nike", 111);
        map.put("sss", 1);
        map.put("vvv", 111);
        map.put("sss", 111);
        map.put("zzz", 111);
        System.out.println(map);
        map.remove("zzz");
        System.out.println(map.containsKey("sss"));
        System.out.println(map.containsValue("111"));
        System.out.println(map.size());
        Set<String> set = map.keySet();
        System.out.println(set);
        Collection<Integer> value = map.values();
        System.out.println(value);

        map.clear();
        System.out.println();
        System.out.println(map.isEmpty());

        Map<String, Integer> map1 = new HashMap<String, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        map1.put("zzvz", 12);
        map1.put("zcz", 14);
        map1.put("zxz", 11);

        map2.put("zxc", 11);
        map2.put("zxz", 12);
        map2.put("zxq", 11);
        map1.putAll(map2);
        System.out.println(map1);


    }
}

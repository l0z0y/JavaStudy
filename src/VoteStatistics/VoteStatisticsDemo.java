package VoteStatistics;

import java.util.*;

/**
 * @author li'zi'yao
 */
public class VoteStatisticsDemo {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();

        List<String> s1 = new ArrayList<>();
        Collections.addAll(s1, "A", "B", "C");
        map.put("zzz", s1);

        List<String> s2 = new ArrayList<>();
        Collections.addAll(s2, "A", "B");
        map.put("xxx", s2);

        List<String> s3 = new ArrayList<>();
        Collections.addAll(s3, "A", "B", "C", "D");
        map.put("ccc", s2);
        System.out.println(map);

        Collection<List<String>> values = map.values();
        System.out.println(values);

        Map<String,Integer> map1 =new HashMap<>();
        for (List<String> value : values) {
            for (String s : value) {
                if (map1.containsKey(s)) {
                    map1.put(s, map1.get(s)+1);
                }else {
                    map1.put(s,1);
                }
            }
        }
        System.out.println(map1);


    }
}

package treemap;

import java.util.TreeMap;

/**
 * @author li'zi'yao
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Apple,String> map = new TreeMap<>((Apple o1, Apple o2) -> Double.compare(o2.getPrice(), o1.getPrice()));

        map.put(new Apple("zzz","红",15.5),"zzzz");
        map.put(new Apple("zzw","红",16.5),"wwww");
        map.put(new Apple("zzc","红",12.5),"xcxc");
        map.put(new Apple("zzx","红",15.5),"qweqw");

        System.out.println(map);



    }
}

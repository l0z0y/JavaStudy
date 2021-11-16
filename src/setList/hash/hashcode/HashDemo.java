package setList.hash.hashcode;

/**
 * @author li'zi'yao
 */
public class HashDemo {
    public static void main(String[] args) {
        String name = "lzy";
        System.out.println(name.hashCode());
        System.out.println(name.hashCode());

        //不同对象的hash值不一样

        String zzz = "zzz";
        System.out.println(zzz.hashCode());
        System.out.println(zzz.hashCode());
    }
}

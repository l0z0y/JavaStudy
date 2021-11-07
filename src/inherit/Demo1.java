package inherit;

/**
 * @author li'zi'yao
 */
public class Demo1 {
    public static void main(String[] args) {
        Fu f = new Fu();
        f.shows();

        Zi z=new Zi();
        z.method();

        //extend继承后 z 可调用Fu中的方法
        z.shows();
    }
}

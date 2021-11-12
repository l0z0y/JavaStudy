package Integer.conversion;

/**
 * @author li'zi'yao
 */
public class IntegerDemo {
    public static void main(String[] args) {

//        Integer i1 = new Integer(100);
//        System.out.println(i1);
//
//        Integer i2 = new Integer("200");
//        System.out.println(i2);

        Integer i3 = Integer.valueOf(500);
        System.out.println(i3);

        Integer i4 = Integer.valueOf("100");
        System.out.println(i4);

        // int 转换为string  String.valueOf(int z)
        int z = 100 ;
        String c = String.valueOf(z);
        System.out.println(c);


        // string 转换为 int  Integer.parseInt(String s )
        String s = "100" ;
        int x = Integer.parseInt(s);
        System.out.println(x);





    }
}

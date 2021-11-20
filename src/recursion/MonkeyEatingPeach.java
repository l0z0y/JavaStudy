package recursion;

/**
 * @author li'zi'yao
 */
public class MonkeyEatingPeach {
    public static void main(String[] args) {
        System.out.println(f(1));
        System.out.println(f(2));
        System.out.println(f(3));
        System.out.println(f(4));
        System.out.println(f(5));
        System.out.println(f(6));
        System.out.println(f(7));
        System.out.println(f(8));
        System.out.println(f(9));

    }
    public static int f(int n ){
        if(n == 10){
            return 1;

        }else {
            return   2 * f(n + 1) + 2;
        }

    }
}

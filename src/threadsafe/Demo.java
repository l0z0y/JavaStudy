package threadsafe;

/**
 * @author li'zi'yao
 */
public class Demo {
    public static void main(String[] args) {
        Accout a =new Accout("acount",10000);
        new TreadWithdrawMoney(a , "zzz").start();
        new TreadWithdrawMoney(a , "ccc").start();


    }
}

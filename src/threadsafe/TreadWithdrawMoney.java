package threadsafe;

/**
 * @author li'zi'yao
 */
public class TreadWithdrawMoney  extends Thread{
    private Accout acc;

    public TreadWithdrawMoney(Accout acc,String name){
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
       acc.drawMoney(10000);
    }
}

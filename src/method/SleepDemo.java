package method;

/**
 * @author li'zi'yao
 */
public class SleepDemo {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 5; i++) {
            System.out.println("输出：" + i);
            if(i == 3){
                // 让当前线程进入休眠状态
                Thread.sleep(3000);
            }
        }
    }
}

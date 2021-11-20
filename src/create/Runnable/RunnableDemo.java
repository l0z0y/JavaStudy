package create.Runnable;

/**
 * @author li'zi'yao
 */
public class RunnableDemo {
    public static void main(String[] args) {
        Runnable target = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程1执行输出：" + i);
            }
        };
        Thread t = new Thread(target);
        t.start();

        new Thread(() ->{
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程2执行输出：" + i);
                }

        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程3执行输出：" + i);
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行输出：" + i);
        }
    }
}
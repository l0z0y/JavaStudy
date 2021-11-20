package create.Thread;

/**
 * @author li'zi'yao
 */
public class ThreadDemo {
    public static void main(String[] args) {
    MyThread m = new MyThread();
    m.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出：" + i);
        }

    }

}
 class MyThread extends Thread{
     @Override
     public void run() {
         for (int i = 0; i < 5; i++) {
             System.out.println("子线程执行输出：" + i);
         }
     }
 }

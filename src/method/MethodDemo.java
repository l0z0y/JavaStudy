package method;

/**
 * @author li'zi'yao
 */
public class MethodDemo {

    public static void main(String[] args) {
        // t1.setName("1号");
        Thread t1 = new MyThread("1号");

        t1.start();
        System.out.println(t1.getName());
        // t2.setName("2号");
        Thread t2 = new MyThread("2号");
        t2.start();
        System.out.println(t2.getName());


        // 哪个线程执行它，它就得到哪个线程对象（当前线程对象）
        // 主线程的名称就叫main
        Thread m = Thread.currentThread();
        System.out.println(m.getName());
        m.setName("最牛的线程");

        for (int i = 0; i < 5; i++) {
            System.out.println( m.getName() + "输出：" + i);
        }
    }
    }

class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        // 为当前线程对象设置名称，送给父类的有参数构造器初始化名称
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println( Thread.currentThread().getName() + "输出：" + i);
        }
    }
}
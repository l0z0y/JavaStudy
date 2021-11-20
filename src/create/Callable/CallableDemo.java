package create.Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author li'zi'yao
 */
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 3、创建Callable任务对象
        Callable call = new MyCallable(100);
        // 4、把Callable任务对象 交给 FutureTask 对象
        //  FutureTask对象的作用1： 是Runnable的对象（实现了Runnable接口），可以交给Thread了
        //  FutureTask对象的作用2： 可以在线程执行完毕之后通过调用其get方法得到线程执行完成的结果
        FutureTask f1 = new FutureTask(call);
        // 5、交给线程处理
        Thread t1 = new Thread(f1);
        // 6、启动线程
        t1.start();


        MyCallable mc = new MyCallable(200);
        FutureTask ft = new FutureTask(mc);
        Thread t = new Thread(ft);
        t.start();

        try {
            // 如果f1任务没有执行完毕，这里的代码会等待，直到线程1跑完才提取结果。

            System.out.println("第一个结果：" + f1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // 如果f2任务没有执行完毕，这里的代码会等待，直到线程2跑完才提取结果。

            System.out.println("第二个结果：" + ft.get());
        } catch (Exception e) {
            e.printStackTrace();
        }


        int n = 300;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("主线程执行的结果是：" + sum);
    }

}

class MyCallable implements Callable {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }

    /**
     2、重写call方法（任务方法）
     */
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return "子线程执行的结果是：" + sum;
    }
}

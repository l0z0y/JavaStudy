package threadpool.runnable;

import java.util.concurrent.*;

/**
 * @author li'zi'yao
 */
public class Demo {
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(3, 5,
                6, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        // 2、给任务线程池处理。
        Runnable target = new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);



    }

}

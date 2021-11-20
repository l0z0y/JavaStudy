package threadpool.create;

import java.rmi.server.ExportException;
import java.util.concurrent.*;

/**
 * @author li'zi'yao
 */
public class CreateDemo {
    ExecutorService pool = new ThreadPoolExecutor(3,5,
            6,TimeUnit.SECONDS,new ArrayBlockingQueue<>(5),
            Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());


}

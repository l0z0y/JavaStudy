package executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author li'zi'yao
 */
public class ExecutorsDemo {

    public static void main(String[] args) {
        ExecutorService e = Executors.newFixedThreadPool(3);
        ExecutorService z = Executors.newCachedThreadPool();

    }
}

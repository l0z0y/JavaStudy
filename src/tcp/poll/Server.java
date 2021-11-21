package tcp.poll;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * @author li'zi'yao
 */
public class Server {
    private static final ExecutorService pool = new ThreadPoolExecutor(3, 5, 5, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(7777);
            while (true) {
                Socket socket = ss.accept();
                System.out.println(socket.getRemoteSocketAddress() + "上线了");
                Runnable threadRunnable = new ThreadRunnable(socket);
                pool.execute(threadRunnable);


            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

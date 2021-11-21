package tcp.poll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author li'zi'yao
 */
public class ThreadRunnable implements Runnable {
    private Socket socket;
    public ThreadRunnable(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {


            InputStream is = socket.getInputStream();
            BufferedReader br =new BufferedReader(new InputStreamReader(is));
            String msg;
            while ((msg = br.readLine())!=null) {
                System.out.println(socket.getRemoteSocketAddress()+" "+msg);


            }

        } catch (IOException e) {

            System.out.println(socket.getRemoteSocketAddress()+"byebye");
        }
    }
}

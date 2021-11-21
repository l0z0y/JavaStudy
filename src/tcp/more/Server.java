package tcp.more;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket ss =new ServerSocket(7777);
            Socket socket = ss.accept();

            InputStream is = socket.getInputStream();
            BufferedReader br =new BufferedReader(new InputStreamReader(is));
            String msg;
            while ((msg = br.readLine())!=null) {
                System.out.println(socket.getRemoteSocketAddress()+" "+msg);


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

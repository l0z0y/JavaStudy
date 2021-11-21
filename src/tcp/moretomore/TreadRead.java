package tcp.moretomore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TreadRead extends Thread{
    private Socket socket;
    public TreadRead(Socket socket){
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
            e.printStackTrace();
        }

    }
}

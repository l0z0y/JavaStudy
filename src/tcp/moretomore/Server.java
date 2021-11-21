package tcp.moretomore;

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
            while (true) {
                Socket socket = ss.accept();
                new TreadRead(socket).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

package tcp.one;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @author li'zi'yao
 */
public class Client {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("127.0.0.1", 7777);
            OutputStream os = socket.getOutputStream();

            PrintStream ps = new PrintStream(os);

            ps.println("OK");
            ps.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

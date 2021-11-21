package tcp.more;

import com.sun.source.tree.WhileLoopTree;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author li'zi'yao
 */
public class Client {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("127.0.0.1", 7777);
            OutputStream os = socket.getOutputStream();

            PrintStream ps = new PrintStream(os);

            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("请说");
                String msg = sc.nextLine();
                ps.println(msg);
                ps.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

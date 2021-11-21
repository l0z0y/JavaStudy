package udp.one;

import java.io.IOException;
import java.net.*;

/**
 * @author li'zi'yao
 */
public class ServerDemo {

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] a = "lllzy".getBytes();
        DatagramPacket packet = new DatagramPacket(a, a.length, InetAddress.getLocalHost(),888);
        socket.send(packet);
    }



}

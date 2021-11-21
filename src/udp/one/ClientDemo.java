package udp.one;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author li'zi'yao
 */
public class ClientDemo {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(888);


        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        socket.receive(packet);
        //读取多少倒出多少
        int len = packet.getLength();
        String rs = new String(buffer,0, len);
        System.out.println("收到了：" + rs);

    }
}

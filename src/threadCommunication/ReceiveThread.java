package threadCommunication;

/**
   接电话线程类
 */
public class ReceiveThread extends Thread{
    public ReceiveThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // 1号  2号
            while(true) {
                CallSystem.receive();
            }
    }
}

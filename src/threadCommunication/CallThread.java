package threadCommunication;

public class CallThread extends Thread{
    public CallThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // 不断的打入电话

            CallSystem.call();

    }
}

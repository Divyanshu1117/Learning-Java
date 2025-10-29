package J163_Q99;

public class Hello_Thread extends Thread {

    private final int threadNumber;

    public Hello_Thread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf(" (%d) %s Hello form Thread - %d\n", (i + 1),
                    Thread.currentThread().getName(),
                    threadNumber);
        }
    }
}
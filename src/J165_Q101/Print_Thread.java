package J165_Q101;

public class Print_Thread extends Thread {

    private final int threadNumber;

    public Print_Thread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {

        System.out.printf("%s Thread Starting - %d\n",
                Thread.currentThread().getName(),
                threadNumber);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s Thread Ended- %d\n",
                Thread.currentThread().getName(),
                threadNumber);
    }
}
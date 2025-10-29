package J164_Q100;

public class Thread_States extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("\nFrom inside run %s", getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
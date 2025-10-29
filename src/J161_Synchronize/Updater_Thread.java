package J161_Synchronize;

public class Updater_Thread extends Thread {
    private final Counter counter;

    public Updater_Thread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
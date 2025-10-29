package J161_Synchronize;

public class Testing_Synchronize {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();
        Updater_Thread t1 = new Updater_Thread(counter);
        Updater_Thread t2 = new Updater_Thread(counter);

        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis();
        System.out.printf("Final counter value: %d and time taken: %d", counter.getCount(), (endTime - startTime));
    }
}
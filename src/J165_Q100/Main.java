package J165_Q100;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread_States t1 = new Thread_States();

        System.out.printf("\nCreate the thread %s", t1.getState());

        t1.start();
        t1.join();

        System.out.printf("\nThread Finished %s", t1.getState());
    }
}
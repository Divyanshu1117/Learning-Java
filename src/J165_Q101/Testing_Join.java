package J165_Q101;

public class Testing_Join {
    public static void main(String[] args) throws InterruptedException {
        Print_Thread t1 = new Print_Thread(1);
        Print_Thread t2 = new Print_Thread(2);
        Print_Thread t3 = new Print_Thread(3);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
package J160_Join;

public class Testing_Join {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Print_Task_1 p1 = new Print_Task_1('*');
        Print_Task_1 p2 = new Print_Task_1('$');
        Print_Task_1 p3 = new Print_Task_1('#');

        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("\n Thread 1 Started: ");

        Thread t2 = new Thread(p2);
        t2.start();
        System.out.println(("\n Thread 2 Started: "));
        t1.join();

        Thread t3 = new Thread(p3);
        t3.start();
        System.out.println("\n Thread 3 Started: ");

        long endTime = System.currentTimeMillis();
        System.out.printf(" %s Total time taken: %d", Thread.currentThread().getName(), (endTime - startTime));
    }
}
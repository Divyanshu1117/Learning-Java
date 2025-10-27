package J159_Testing_Priority;

public class Testing_Runnables {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Print_Task p1 = new Print_Task('*');
        Print_Task p2 = new Print_Task('$');
        Print_Task p3 = new Print_Task('#');

        Thread t1 = new Thread(p1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();

        Thread t2 = new Thread(p2);
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();

        Thread t3 = new Thread(p3);
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf(" %s Total time taken: %d",
                Thread.currentThread().getName(),
                (endTime - startTime));
    }
}
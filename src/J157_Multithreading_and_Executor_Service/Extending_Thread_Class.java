package J157_Multithreading_and_Executor_Service;

public class Extending_Thread_Class {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        First_Task t1 = new First_Task();
        Second_Task t2 = new Second_Task();
        Third_Task t3 = new Third_Task();

        t1.start();
        System.out.println("\n Starting First Thread");
        t2.start();
        System.out.println("\n Starting Second Thread");
        t3.start();
        System.out.println("\n Starting Third Thread");

        long endTime = System.currentTimeMillis();
        System.out.printf(" %s Total time taken: %d",
                Thread.currentThread().getName(),
                (endTime - startTime));
    }
}
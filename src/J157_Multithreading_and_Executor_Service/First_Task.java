package J157_Multithreading_and_Executor_Service;

public class First_Task extends Thread {
    @Override
    public void run() {
        // First Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d:* ", i);
        }
        System.out.printf("\n %s * Task Complete", Thread.currentThread().getName());
    }
}
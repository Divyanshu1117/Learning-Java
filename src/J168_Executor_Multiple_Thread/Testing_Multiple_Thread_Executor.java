package J168_Executor_Multiple_Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Testing_Multiple_Thread_Executor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            Print_Task_4 task = new Print_Task_4((char) i);
            service.submit(task);
        }

//        Print_Task_4 task1 = new Print_Task_4('*');
//        Print_Task_4 task2 = new Print_Task_4('$');
//        Print_Task_4 task3 = new Print_Task_4('#');

//        service.submit(task1);
//        service.submit(task2);
//        service.submit(task3);

        service.shutdown();
        System.out.println("\n************1");
        if (!service.awaitTermination(30, TimeUnit.SECONDS)) {
            System.out.println("\n************2");
            service.shutdownNow();
        }
    }
}
package J167_Executor.Single_Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Testing_Single_Thread_Executor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Print_Task_3 task1 = new Print_Task_3('*');
        Print_Task_3 task2 = new Print_Task_3('$');
        Print_Task_3 task3 = new Print_Task_3('#');

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        service.shutdown();
    }
}
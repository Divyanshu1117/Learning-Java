package J169_Executor_Testing_Futures;

import java.util.concurrent.*;

public class Testing_Futures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Fetch_Name task1 = new Fetch_Name("Divyanshu ");
        Fetch_Name task2 = new Fetch_Name("Sanchit ");
        Fetch_Name task3 = new Fetch_Name("Ecomm Study ");
        Fetch_Name task4 = new Fetch_Name("Subscriber ");

        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);

        System.out.printf("\nFull Name is: %s", name1.get());
        System.out.printf("\nFull Name is: %s", name2.get());
        System.out.printf("\nFull Name is: %s", name3.get());
        System.out.printf("\nFull Name is: %s", name4.get());

        service.shutdown();
    }
}
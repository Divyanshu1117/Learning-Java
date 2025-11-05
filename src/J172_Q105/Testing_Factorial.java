package J172_Q105;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Testing_Factorial {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            List<Future<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                Factorial_Calculator task = new Factorial_Calculator(i);
                list.add(service.submit(task));
            }
            for (Future<Integer> future : list) {
                System.out.printf("\n Result is: %d", future.get());
            }
            service.shutdown();
            if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("That's enough now.");
                service.shutdown();
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
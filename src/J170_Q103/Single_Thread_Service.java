package J170_Q103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Single_Thread_Service {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            Print_Numbers task = new Print_Numbers();
            service.submit(task);
        }
    }
}
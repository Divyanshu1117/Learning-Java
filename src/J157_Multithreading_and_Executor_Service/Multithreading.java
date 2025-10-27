package J157_Multithreading_and_Executor_Service;

public class Multithreading {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        // First Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d:* ", i);
        }
        System.out.println("\n * Task Complete");

        // Second Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d:$ ", i);
        }
        System.out.println("\n $ Task Complete");

        // Third Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d:# ", i);
        }
        System.out.println("\n # Task Complete");
        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken: %d", (endTime - startTime));
    }
}
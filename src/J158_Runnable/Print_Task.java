package J158_Runnable;

public class Print_Task implements Runnable {

    @Override
    public void run() {
        // Print Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d%c ", i, targetChar);
        }
        System.out.printf("\n %s %c Task Complete", Thread.currentThread().getName(), targetChar);
    }

    private final char targetChar;

    public Print_Task(char targetChar) {
        this.targetChar = targetChar;
    }
}
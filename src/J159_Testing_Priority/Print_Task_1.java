package J159_Testing_Priority;

public class Print_Task_1 implements Runnable {

    @Override
    public void run() {
        // Print Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d%c ", i, targetChar);
        }
        System.out.printf("\n %s %c Task Complete", Thread.currentThread().getName(), targetChar);
    }

    private final char targetChar;

    public Print_Task_1(char targetChar) {
        this.targetChar = targetChar;
    }
}
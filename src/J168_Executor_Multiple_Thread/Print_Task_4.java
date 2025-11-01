package J168_Executor_Multiple_Thread;

public class Print_Task_4 implements Runnable {

    @Override
    public void run() {
        // Print Task
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%d%c ", i, targetChar);
        }
        System.out.printf("\n %s %c Task Complete", Thread.currentThread().getName(), targetChar);
    }

    private final char targetChar;

    public Print_Task_4(char targetChar) {
        this.targetChar = targetChar;
    }
}
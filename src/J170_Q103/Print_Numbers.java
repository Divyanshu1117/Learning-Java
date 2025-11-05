package J170_Q103;

public class Print_Numbers implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Number is %d \n", i + 1);
        }
    }
}
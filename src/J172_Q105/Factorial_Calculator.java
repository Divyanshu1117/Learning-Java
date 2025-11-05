package J172_Q105;

import java.util.concurrent.Callable;

public class Factorial_Calculator implements Callable<Integer> {

    private final int number;

    public Factorial_Calculator(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        if (number <= 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i < number; i++) {
            result *= i;
        }
        return result;
    }
}
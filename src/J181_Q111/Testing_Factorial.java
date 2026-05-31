package J181_Q111;

import java.util.stream.IntStream;

public class Testing_Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial using two ways");
        int number = 9;
        System.out.println(factorial(number));

        IntStream.rangeClosed(2, number)
//                .forEach(System.out::println);
                .reduce((a, b) -> a * b)
                .ifPresent(System.out::println);
    }

    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }

        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
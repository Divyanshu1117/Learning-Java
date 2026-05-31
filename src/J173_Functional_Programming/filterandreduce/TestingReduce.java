package J173_Functional_Programming.filterandreduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 4, 2, 5, 6, 3);
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Normal Sum " + sum);

        int newSum = numbers.stream().reduce(0, new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });
        System.out.printf("\n Sum using reduce is %d", newSum);

        int newSum2 = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.printf("\n Sum using reduce is %d", newSum2);

        int max = numbers.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.printf("\n Max using reduce is %d", max);
    }
}
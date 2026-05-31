package J185_Q115;

import java.util.List;

public class Final_Test {
    public static void main(String[] args) {
        List<String> numbers = List.of("1", "2", "3", "4", "5");
        numbers.stream()
//                .map(str -> Integer.parseInt(str))
                .map(Integer::parseInt)
                .map(num -> Math.pow(num, 2))
//                .reduce((a, b) -> a + b)
                .reduce(Double::sum)
                .ifPresent(System.out::println);
    }
}
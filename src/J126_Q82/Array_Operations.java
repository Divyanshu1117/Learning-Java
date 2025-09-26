package J126_Q82;

import java.util.Arrays;

public class Array_Operations {

    public static class Statistics {

        private int[] numbers;

        public Statistics(int[] numbers) {
            this.numbers = numbers;
        }

        public double mean() {
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum / numbers.length;
        }

        public double median() {
            int[] sorted = numbers.clone();
            Arrays.sort(sorted);
            int n = sorted.length;
            if (n % 2 == 0) {
                return (sorted[n / 2 - 1] + sorted[n / 2]) / 2.0;
            } else {
                return sorted[n / 2];
            }
        }
    }
}
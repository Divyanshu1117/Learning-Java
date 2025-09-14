public class J64_Q39 {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sum  and Average");
        int[] numArray = J64_Part1_ArrayUtility.inputArray();
        long sum = sum(numArray);
//      int avg = average(numArray);
        double avg = average(numArray);
        System.out.println("Sum of the numbers is: " + sum);
        System.out.println("Average of the number is: " + avg);
    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

//        public static int average(int[] numArray) {
//        long sum = sum(numArray);
//        return (int) (sum / numArray.length);
//    }
    public static double average(int[] numArray) {
        double sum = sum(numArray);
        return (sum / numArray.length);
    }
}
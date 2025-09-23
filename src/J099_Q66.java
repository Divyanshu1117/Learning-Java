public class J099_Q66 {
    public static void main(String[] args) {
        System.out.println("Welcome to adding positive numbers.");
        int[] numArr = J064_Part1_ArrayUtility.inputArray();

        int sum = 0;
        for (int num : numArr) {
            if (num < 0) {
                continue;
            }
            sum += num;
        }
        System.out.println("The sum of positive is: " + sum);
    }
}
public class J096_Q63 {
    public static void main(String[] args) {
        System.out.println("Welcome to finding the maximum: \n");
        int[] arr = J064_Part1_ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println("Maximum number is: " + max);
    }
}
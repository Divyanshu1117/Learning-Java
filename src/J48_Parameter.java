public class J48_Parameter {
    public static void main(String[] args) {
        int num = sumTwoNumbers(4, 7);
        System.out.println(num);
//        System.out.println(sumTwoNumbers(4, 7));
//        System.out.println(sumTwoNumbers(5, 9));
//        System.out.println(sumTwoNumbers(-67, 67));
    }

    public static int sumTwoNumbers(int firstNum, int secondNum) {
        System.out.println("First Number received: " + firstNum);
        System.out.println("Second Number received: " + secondNum);
//        int sum = first + second;
//        return sum;
        return firstNum + secondNum;
    }
}
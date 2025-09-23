public class J090_Break_And_Continue {
    public static void main(String[] args) {

//        System.out.println("Before Loop");
//        for (int i = 1; i < 10000; i++) {
//            if (i == 101) {
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("Out of loop");

        System.out.println("Before Loop");
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");
    }
}
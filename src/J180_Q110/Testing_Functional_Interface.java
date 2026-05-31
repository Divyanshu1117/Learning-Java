package J180_Q110;

public class Testing_Functional_Interface {
    public static void main(String[] args) {
        Candidate candidate = num -> {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(candidate.isCandidate(12));
    }
}
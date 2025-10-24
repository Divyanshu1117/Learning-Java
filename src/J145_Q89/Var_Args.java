package J145_Q89;

public class Var_Args {
    public static void main(String[] args) {
        System.out.println(concatenate("Divyanshu"));
        System.out.println(concatenate("Lovish", "Kamboj"));
        System.out.println(concatenate("My", "name", "is", "Divyanshu"));
    }

    public static String concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
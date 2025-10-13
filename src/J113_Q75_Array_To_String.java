public class J113_Q75_Array_To_String {
    public static void main(String[] args) {
        String[] arr = new String[]{"If",
                "you", "want", "to", "know", "what", "a", "man’s", "like",
                "take", "a", "good", "look", "at", "how", "he", "treats",
                "his", "inferiors,", "not", "his", "equals." };
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
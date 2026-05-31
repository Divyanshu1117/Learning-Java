package J176_Q108;

import java.util.List;

public class StringFilterAndConcatenate {
    public static void main(String[] args) {
        List<String> strs = List.of("Divyanshu Vashishth",
                "is teaching JAVA",
                "on YouTube",
                "Best YouTube Programming channel");

        String result = strs.stream()
                .filter(str -> str.length() > 10)
                .reduce("", (a, b) -> a + " " + b);
        System.out.println(result);
    }
}
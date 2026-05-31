package J175_Q107;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = List.of("Divyanshu", "Shubham", "Coding");
        names.stream()
                .forEach(name -> System.out.println(name));
    }
}
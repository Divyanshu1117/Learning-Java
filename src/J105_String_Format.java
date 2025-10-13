public class J105_String_Format {
    public static void main(String[] args) {
        String name = "Sandeep";
        int marks = 45;
//        System.out.println("Hello " + name + " your marks are: " + 45);
        System.out.printf("Hello %s, your marks are: %d", name, marks);
    }
}
package J122_Equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Divyanshu", 25, "001");
        Person person2 = new Person("Divyanshu", 25, "001");

        if (person1.equals(person2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not, Equals");
        }
    }
}
package J125_Q81;

public class Equals_And_Hash_Code_Test {
    public static void main(String[] args) {
        J125_Q81.Person person1 = new J125_Q81.Person("Divyanshu", 26);
        J125_Q81.Person person2 = new J125_Q81.Person("Divyanshu", 25);

        if (person1.equals(person2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not, Equals");
        }
    }
}
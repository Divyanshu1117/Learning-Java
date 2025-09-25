package J120_Q79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Divyanshu", 25, 25000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Gulu");
        System.out.println(emp.getEmployeeDetails());
    }
}
package J119_Q78;

public class Customer {
    public static void main(String[] args) {
        Bank_Account account = new Bank_Account("001", "Divyanshu Vashishth");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-40);
        account.withdrawMoney(0);
    }
}
package J163_Q99;

public class Main {
    public static void main(String[] args) {
        Hello_Thread t1 = new Hello_Thread(1);
        Hello_Thread t2 = new Hello_Thread(2);

        t1.start();
        t2.start();
    }
}
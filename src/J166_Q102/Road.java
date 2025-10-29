package J166_Q102;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        Traffic_Light_Thread red = new Traffic_Light_Thread(Traffic_Color.RED);
        Traffic_Light_Thread yellow = new Traffic_Light_Thread(Traffic_Color.YELLOW);
        Traffic_Light_Thread green = new Traffic_Light_Thread(Traffic_Color.GREEN);

        green.start();
        green.join();
        yellow.start();
        yellow.join();
        red.start();
    }
}
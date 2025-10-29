package J166_Q102;

public class Traffic_Light_Thread extends Thread {
    private final Traffic_Color color;

    public Traffic_Light_Thread(Traffic_Color color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s active\n", color);
        try {
            Thread.sleep(color.getOntimeInMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive\n", color);
    }
}
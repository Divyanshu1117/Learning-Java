package J166_Q102;

public enum Traffic_Color {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private final int ontimeInMills;

    public int getOntimeInMills() {
        return ontimeInMills;
    }

    Traffic_Color(int ontimeInMills) {
        this.ontimeInMills = ontimeInMills;
    }
}
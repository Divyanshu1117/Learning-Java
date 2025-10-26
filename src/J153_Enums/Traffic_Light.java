package J153_Enums;

public enum Traffic_Light {
    RED("Stop"), GREEN("Go"), YELLOW("Caution");

    private final String action;

    Traffic_Light(String action) {
        this.action = action;
    }
}
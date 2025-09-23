public class J111_Q73_Dice_Roll {

    int roll() {
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }

    public static void main(String[] args) {
        J111_Q73_Dice_Roll dice = new J111_Q73_Dice_Roll();
        for (int i = 0; i < 5; i++) {
            System.out.println(dice.roll());
        }
    }
}
import java.util.Scanner;

public class J112_Q74_Guessing_Game {
    int random;

    J112_Q74_Guessing_Game() {
        random = (int) Math.ceil(Math.random() * 100);
    }

    int guess(int guessNumber) {
        return guessNumber - random;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        J112_Q74_Guessing_Game game = new J112_Q74_Guessing_Game();
        System.out.println("Welcome to the guessing game. Guess the number between 1-100");
        int guess;
        int result;
        do {
            System.out.print("Guess the number: ");
            guess = input.nextInt();
            result = game.guess(guess);
            if (result == 0) {
                System.out.println("Congrats, your guess is correct");
            } else if (result < 0) {
                System.out.println("Please Guess Higher");
            } else {
                System.out.println("Please Guess Lower");
            }
        } while (result != 0);
    }
}
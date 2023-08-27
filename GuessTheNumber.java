import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        int computerNumber = randomNumber.nextInt(101);
        boolean isValid = true;
        System.out.println("Hey you! Want to play a game?");
        String playerInput = scanner.nextLine();
        if (playerInput.equals("yes")) {

            while (!playerInput.equals("no")) {
                System.out.print("Guess a number (1-100): ");
                playerInput = scanner.nextLine();
                int playerGuess;

                for (int i = 1; i < playerInput.length(); i++) {

                    if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                        isValid = false;
                        break;
                    }
                    if (isValid) {
                        playerGuess = Integer.parseInt(playerInput);
                        if (playerGuess == computerNumber) {
                            System.out.println("You guessed it!");
                            return;
                        } else if (playerGuess > computerNumber) {
                            System.out.println("Too high.");
                        } else {
                            System.out.println("Too Low.");
                        }
                    } else {
                        System.out.println("Invalid input!");
                    }
                }
            }
        } else if (playerInput.equals("no")) {
            System.out.println("Im so disappointed!");
        }
        else {
            System.out.println("Tha`s not understandable answer! Try again next time!");
        }

    }
}

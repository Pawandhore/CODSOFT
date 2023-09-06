import java.util.Random;
import java.util.Scanner;

public class GAME
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;

        int score = 0;
        boolean playAgain = true;

        System.out.println("welcome to the Number Guessing Game!");

        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;

            System.out.println("I've selected a number between" + minRange + "and" + maxRange + ". Try to guess it!");

            while (attempts < maxAttempts) {
                System.out.println("Enter your Guess:");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("congratulations! you guessed the number in" + attempts + "attempts.");
                    score += (maxAttempts - attempts + 1);
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            if (attempts >= maxAttempts) {
                System.out.println("Sorry, you've used all your attempts. The correct number was" + targetNumber);
            }

            System.out.println("Your current score is: " + score + ". play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Thanks for playing! Your final score is: " + score);
        scanner.close();
    }
}

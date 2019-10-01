import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(10);
        int guess;
        int tries = 3;
        boolean hasWon = false;

        while (!hasWon) {
            System.out.println("Give me a number from 1 to 10: \nYou must guess it in three tries.");
            guess = scan.nextInt();
            tries--;

            if (guess == numberToGuess) {
                hasWon = true;
            } else if (guess != numberToGuess) {
                System.out.println("Wrong, try again. ");
            }
            
            if (tries == 0) {
                System.out.println("You have used your 3 tries. Your number was " + numberToGuess + ". Please try again.");
                return;
            }
        }
        System.out.println("You win! You guessed it in under 3 tries.");
    }
}
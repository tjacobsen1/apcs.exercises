import java.util.*;

public class SqrtGame {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        
        boolean endOfGame = false;

        int rounds;
        double player1guess, player2guess;
        int player1wins, player2wins = 0;

        System.out.println("How many rounds? ");
        rounds = scan.nextInt();

        while (!endOfGame) {
            double x = rand.nextDouble(99);

            System.out.println("First Player, sign in: ");
            String player1 = scan.nextLine();
            System.out.println("Second player, sign in: ");
            String player2 = scan.nextLine();

            System.out.println("What is the square root of " + x + "?");
            System.out.println(player1 + ", your guess: ");
            player1guess = scan.nextDouble();
            System.out.println(player2 + ", your guess: ");
            System.out.println("The correct square root of " + x + " is " + Math.sqrt(x));
            System.out.println(player1 + " is " + player1difference + " away and " + player2 + " is " + player2difference + " away. ");

            double player1difference = Math.abs(player1guess - x);
            double player2difference = Math.abs(player2guess - x);
            if (player1difference < player2guess) {
                
                System.out.println(player1 + " wins!");
                rounds-=1;
                player1wins+=1;
            } else {
                System.out.println(player2 + " wins!");
                rounds-=1;
                player2wins+=1;
            }
            
            if (rounds = 0) {
                endOfGame = true;
            }

        }

        System.out.println("---- Final Score ---- ");
        System.out.println(player1 + ": " + player1wins + "   " + player2 + ": " + player2wins);
    }
}
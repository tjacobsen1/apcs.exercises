import java.util.*;
public class SqrtGame {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String player1;
        String player2;
        int player1wins = 0;
        int player2wins = 0;
        int rounds;
        double player1guess, player2guess;

        System.out.println("How many rounds? ");
        rounds = scan.nextInt();

        System.out.println("First Player, sign in: ");
        scan.nextLine();
        player1 = scan.nextLine();
        System.out.println("Second player, sign in: ");
        player2 = scan.nextLine();

        boolean endOfGame = false;
        while (!endOfGame) {
            
            double x = rand.nextDouble()*99;
            double sqrtx = Math.sqrt(x);

            System.out.println("What is the square root of " + x + "?");
            System.out.println(player1 + ", your guess: ");
            player1guess = scan.nextDouble();
            System.out.println( player2 + ", your guess: ");
            player2guess = scan.nextDouble();
            System.out.println("The correct square root of " + x + " is " + Math.sqrt(x));

            double player1difference = Math.abs(player1guess - sqrtx);
            double player2difference = Math.abs(player2guess - sqrtx);
            System.out.println( player1 + " is " + player1difference + " away and " + player2 + " is " + player2difference + " away. ");
            if ( player1difference < player2difference ) {
                System.out.println(player1 + " wins!");
                rounds-=1;
                player1wins+=1;
            } else {
                System.out.println(player2 + " wins!");
                rounds-=1;
                player2wins+=1;
            }
            if (rounds == 0) {
                endOfGame = true;
            }

        }
        System.out.println("---- Final Score ---- ");
        System.out.println(player1 + ": " + player1wins + "   " + player2 + ": " + player2wins);
    }
}
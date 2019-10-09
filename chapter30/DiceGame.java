import java.util.*;

public class DiceGame {
    public static void main(String[]args) { 
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int playerscore = 0;
        int compscore = 0;

        boolean endOfGame = false;

        System.out.println("You are playing the game Pig. Each player starts with 0 points. The winner is the first to reach 100 points. ");


        while (!endOfGame) {
            int playerScoreToBeAdded;
            int compScoreToBeAdded;
            
            int num1 = (int)(Math.random() * 6 + 1);
            int num2 = (int)(Math.random() * 6 + 1);
            int num3 = (int)(Math.random() * 6 + 1);
            int num4 = (int)(Math.random() * 6 + 1);
            int num5 = (int)(Math.random() * 6 + 1);
            int num6 = (int)(Math.random() * 6 + 1);

            compScoreToBeAdded = num1 + num2 + num3;
            playerScoreToBeAdded = num4 + num5 + num6;
            compscore = compscore + compScoreToBeAdded;

            if (num4 == 1 || num5 == 1 || num6 == 1) {
                playerscore = playerscore;
            } else {
                playerscore = playerscore + playerScoreToBeAdded;
            }



            System.out.println("After this round: \nThe computer's score is: " + compscore);
            System.out.println("and the player's score is: " + playerscore);
            
            if (playerscore >= 100 || compscore >= 100) {
                endOfGame = true;
            }
        }
        
        if (playerscore > compscore) {
            System.out.println("The player wins! Final score: " + playerscore + " \nComputer Score: " + compscore);
        } else {
            System.out.println("Computer wins. Final score: " + compscore + " \nPlayer Score: " + playerscore);
        }
        
    }
}
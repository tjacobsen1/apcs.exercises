import java.util.Scanner;

public class Change
{
    public static void main (String[] args)
    {
        int inData;
        Scanner scan = new Scanner(System.in);
        int dollars;
        int quarters;
        int dimes;
        int nickels;
        int pennies;

        System.out.println("Give the change: ");
        inData = scan.nextInt();
        dollars = inData / 100;
        quarters = (inData % 100) / 25;
        dimes = ((inData % 100) % 25) / 10;
        nickels = (((inData % 100) % 25) % 10) / 5;
        pennies = ((((inData % 100) % 25) % 10) % 5) / 1;

        System.out.println("You gave " + inData + " in change which would give you " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " cents.");

    }
}
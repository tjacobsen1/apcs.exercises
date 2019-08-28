import java.util.Scanner;

public class Dollars
{
    public static void main (String[] args)
    {
        int inData;
        Scanner scan = new Scanner(System.in);
        int dollars;
        int cents;

        System.out.println("Input the cents: ");
        inData = scan.nextInt();
        dollars = inData/100;
        cents = inData % 100;
        
        
        
        System.out.println("You input: " + inData + " cents and that in dollars is " + dollars + " dollars and " + cents + " cents.");
    }
}
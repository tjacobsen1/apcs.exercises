import java.util.Scanner;

public class Discount
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        double amount;
        double disc = 0.0;

        System.out.println("Purchase amount: $");
        amount = scan.nextDouble();
        if (amount > 10) {
            disc = amount - (amount * .10);
            System.out.println("Discounted price: $" + disc); 
        } else {
            System.out.println("No discount. Price: $" + amount);
        }
    }
}
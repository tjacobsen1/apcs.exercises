import java.util.Scanner;

public class Pie
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);
        int amount;
        


        System.out.println("Input Weight");
        amount = scan.nextInt();
        if ( 250 >= amount && 30 <= amount) {
            System.out.println(" You are allowed to enter");
        } else{ 
            System.out.println(" You are not allowed to enter");
        }
    }
}
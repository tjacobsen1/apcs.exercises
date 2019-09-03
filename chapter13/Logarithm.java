import java.util.Scanner;

public class Logarithm
{
    public static void main(String[] args)
    {
        double x;
        double n;
        double solved;
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a double: ");
        x = scan.nextDouble();
        x = Math.log(x);

        n = Math.log(2);
        solved = x / n;
        System.out.println("Base 2 log of " + x + " is " + solved);
    }
}
import java.util.Scanner;

public class Combinations {
    
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
    
    static int combination
    
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        int nCr = 0;
        int i, fact = 1;
        int number, combin;

        System.out.println("Input a number:");
        number = scan.nextInt();
        System.out.println("Input a number of combinations:");
        combin = scan.nextInt();

        fact = factorial(number);

        System.out.println("Factorial of " + )
    }
}
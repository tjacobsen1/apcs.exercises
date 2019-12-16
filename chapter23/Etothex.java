import java.util.Scanner;

public class Etothex {
    
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        double sum = 0.0;
        int n = 0;
        double term = 1;
        System.out.println("Enter X: ");
        x = scan.nextInt();
        
        while (term > 1.0E-12) {
            term = Math.pow(x, n) / factorial(n);
            sum += term;
            System.out.println("n:" + n + "\nterm:" + term + "\nsum" + sum);
            n++;
        }

        System.out.println("Mine: " + sum);
        System.out.println("Actual: " + Math.exp(x));
    }

    
    public static double factorial(int num) {
        int i = 1;
        double factorial = 1; 

        while ( i <= num) {
            factorial *= i;
            i++;
        }
        return factorial;
    }
}
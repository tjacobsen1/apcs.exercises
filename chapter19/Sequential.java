import java.util.Scanner;

public class Sequential {

    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        int n = 0;
        int sum;
        int end = 0;
        int x = 0;

        System.out.println("Give me N: ");
        n = scan.nextInt();
        

        while (x <= n) {
            x = x + 1;
            end = (n*(n+1))/2;
        }
        sum = (n*(n+1))/2;
        
        System.out.println("Loop sum = " + end);
        System.out.println("Formula sum = " + sum);
    }
}
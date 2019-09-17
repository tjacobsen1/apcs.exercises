import java.util.Scanner;

public class Adding {

    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        int added;
        int num = 0;

        System.out.println("How many integers will be added: ");
        added = scan.nextInt();
        

        while ( added > 0 ) {
           System.out.println("Enter an integer: ");
            num = scan.nextInt() + num;
            added = added - 1;
        }
        System.out.println("The sum is " + num);
    }
}
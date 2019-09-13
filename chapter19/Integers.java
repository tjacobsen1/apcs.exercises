import java.util.Scanner;

public class Integers {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int value = 0;
        int end;
        
        System.out.println("Give me the starting number: ");
        value = scan.nextInt();
        System.out.println("Give me the ending number: ");
        end = scan.nextInt();
        
        while (value <= end) {
            System.out.println(value);
            value = value + 1;
        }
    }
}
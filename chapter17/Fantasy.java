import java.util.Scanner;

public class Fantasy {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int strength, health, luck;

        System.out.println("Enter the strength of your character (0-10): ");
        strength = scan.nextInt();
        System.out.println("Enter the health (0-10); ");
        health = scan.nextInt();
        System.out.println("Enter the luck (0-10): ");
        luck = scan.nextInt();
    }
}
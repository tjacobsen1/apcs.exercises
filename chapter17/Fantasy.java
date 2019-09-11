import java.util.Scanner;

public class Fantasy {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int strength, health, luck;
        String name = new String();

        System.out.println("Enter the name of your character: ");
        name = scan.nextLine();
        System.out.println("Enter the strength of your character (0-10): ");
        strength = scan.nextInt();
        System.out.println("Enter the health (0-10); ");
        health = scan.nextInt();
        System.out.println("Enter the luck (0-10): ");
        luck = scan.nextInt();
        if ((strength + health + luck ) > 15) {
            System.out.println("You have given your character too many points! Default values have been assigned: ");
            System.out.println(name + "strength: 5, health: 5, luck: 5");
        } else {
            System.out.println("Your name is: " + name);
            System.out.println("Your strength is " + strength);
            System.out.println("Your health is " + health);
            System.out.println("Your luck is " + luck);
        }
    }
}
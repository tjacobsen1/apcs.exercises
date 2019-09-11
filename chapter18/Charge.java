import java.util.Scanner;

public class Charge {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int checking, saving;

        System.out.println("How much is in your checking account? ");
        checking = scan.nextInt();
        System.out.println("How much is in your savings account? ");
        saving = scan.nextInt();

        if (checking > 1000 || saving > 1500) {
            System.out.println("There is no service charge for writing checks. ");
        } else {
            System.out.println("You have a $0.15 service charge per check.");
        }
    }
}
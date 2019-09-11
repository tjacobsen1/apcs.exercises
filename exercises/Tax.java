import java.util.Scanner;

public class Tax {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double income, taxes, percentage;
        taxes = 0;
        System.out.println("what is your yearly income in dollars?");
        income = scan.nextDouble();

        if (income < 15000) {
            taxes = 0;
        } else if (income > 15000 && income < 35000) {
            taxes = (income - 15000) * 0.1;
        } else if (income > 35000 && income < 65000) {
            taxes = ((income - 35000) * 0.16) + 2000;
        } else if (income > 65000 && income < 105000) {
            taxes = ((income - 65000) * 0.19) + 2000 + 4800;
        } else if (income >= 105000) {
            taxes = ((income - 105000) * 0.22) + 2000 + 4800 + 7600;
        }
        percentage = (taxes / income) * 100;
        System.out.println("With your income of " + income + " dollars, you will be paying " + taxes + " dollars in taxes which is " + percentage + " percent.");
    }
}
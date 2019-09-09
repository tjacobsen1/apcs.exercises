import java.util.Scanner;

public class Age
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double years;
        double months;
        double days;
        double age; 
        double daysage;
        double lifespan;

        System.out.println("Give your age in years: ");
        years = scan.nextDouble();
        System.out.println("How many more months?: ");
        months = scan.nextDouble();
        System.out.println("And how many days?: ");
        days = scan.nextDouble();
        // if (months = 1) {
        //     months = 31;
        // } else if (months = 2) {
        //     months = 31 + 28;
        // } else if (months = 3) {
        //     months = 31 + 28 + 31;
        // } else if (months = 4) {
        //     months = 31 + 28 + 31 + 30;
        // } else if (months = 5) {
        //     months = 31 + 28 + 31 + 30 + 31;
        // } else if (months = 6) {
        //     months = 31 + 28 + 31 + 30 + 31 + 30;
        // } else if (months = 7) {
        //     months = 31 + 28 + 31 + 30 + 31 + 30 + 31;
        // } else if (months = 8) {
        //     months = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
        // } else if (months = 9) {
        //     months = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
        // } else if (months = 10) {
        //     months = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
        // } else if (months = 11) {
        //     months = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
        // } else if (months >= 12) {
        //     System.out.println("More than 12 months. Add that to your years and try again.");
        //     return;
        // }

        daysage = (years * 365) + (months * 30) + (days);

        age = (((daysage * 24) * 60) * 60);

        System.out.println("You said you have been alive for " + years + " years " + months + " months " + days + " days and that means you have been alive for " + age + " seconds ");
        
        lifespan = age / 2.5E+9;

        System.out.println("The average human lifespan is about 2.5 billion seconds which means you have lived about " + lifespan + " of your life" );
        
    }
}
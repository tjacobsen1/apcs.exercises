import java.util.Scanner;

public class OrderChecker
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        double bolts;
        double nuts;
        double washers;
        Double total;

        System.out.println("Bolts");
        bolts = scan.nextDouble();
        System.out.println("Nuts");
        nuts = scan.nextDouble();
        System.out.println("Washers");
        washers = scan.nextDouble();

        if (nuts == bolts && washers == bolts*2){
            total = (bolts * 5) + (nuts * 3) + washers;
            System.out.println("Total Cost: $" + total);
        } else if (washers != bolts *2) {
            System.out.println("Check the order: uneven washers");
        } else {
            System.out.println("Check the order: uneven nuts");

        }
    }
}
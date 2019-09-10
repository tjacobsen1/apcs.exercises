import java.util.Scanner;

public class Internet {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = new String();
        double price = 0.0;
        double delivery = 0.0;
        double total = 0.0;



        System.out.println("Enter the item: ");
        item = scan.nextLine();
        System.out.println("Enter the price: ");
        price = scan.nextDouble();
        System.out.println("Overnight delivery? 0 for No, 1 for Yes: ");
        delivery = scan.nextDouble();
        
        if (price < 10 && delivery ==1) {
            total = price + 2;
        } else if (price >= 10 && delivery ==0) {
            total = price;
        } else {
            total = price + 3;
        }

        System.out.println("Invoice: ");
        System.out.println(item + " " + price);
        System.out.println("Total: " + total);
    }
}
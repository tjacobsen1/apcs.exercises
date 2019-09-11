import java.util.Scanner;

public class Dump {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        int lbs;
        double total;
        total = 0;
        System.out.println("Enter how many pounds of trash you'd like to dispose of: ");
        lbs = scan.nextInt();
        if ( lbs <= 299 && lbs >= 200  ){
            total = 20 ;
            System.out.println("You will be charged " + total + " dollars for the trash you wish to dump.");

        }else if( lbs >= 300){
            lbs = lbs - 200 ;
            total = Math.round(lbs / 100) * 8 + 20;
            Math.round(total);
            System.out.println("You will be charged " + total + " dollars for the trash you wish to dump.");
        }
        
        

    }
}
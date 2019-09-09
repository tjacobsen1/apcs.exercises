import java.util.Scanner;

public class Gas

{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        double capacity;
        double gage;
        double mpg;
        double miLeft;

        System.out.println("Tank capacity: ");
        capacity = scan.nextDouble();
        System.out.println("Gage reading: (percentage) ");
        gage = scan.nextDouble(); 
        System.out.println("MPG: ");
        mpg = scan.nextDouble();

        miLeft = (capacity * (gage/100) * mpg);

        if (miLeft >= 200){
            System.out.println("Safe to Proceed.");
        } else {
            System.out.println("Get Gas!");
        }

        
    }
}
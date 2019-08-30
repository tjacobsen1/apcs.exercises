import java.util.Scanner;

public class Appliance
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double inData;
        double inData2;
        double cost;

        System.out.println("Input the cost in cents: ");
        inData = scan.nextDouble();
        inData = inData / 100;
        System.out.println("Input the hours: ");
        inData2 = scan.nextDouble();
       
        System.out.println("Annual cost: " + (inData*inData2));
    }
}
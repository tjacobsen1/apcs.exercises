import java.util.Scanner;


public class Volts
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        long V;
        long R;
        double I;

        System.out.println("Input voltage");
        V = scan.nextLong();
        System.out.println("Input the resistance");
        R = scan.nextLong();

        System.out.println(I = (V + 0.0) / R);
    }
}
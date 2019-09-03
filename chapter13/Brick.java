import java.util.Scanner;

public class Brick
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double inData;
        double distance;
        

        
        

        System.out.println("Give the time: ");
        inData = scan.nextDouble();
        distance = (0.5 * 32.174) * (inData * inData);

        System.out.println("Here is the distance traveled: " + distance);
    }
}
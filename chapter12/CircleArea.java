import java.util.Scanner; 

public class CircleArea
{
    public static void main(String[] args)
    {
        double inData;
        Scanner scan = new Scanner(System.in);
        double area;

        System.out.println("Give the radius: ");
        inData = scan.nextDouble();
        area = inData * inData * Math.PI;

        System.out.println("You entered:" + inData + "and the area is: " + area);
    }
}
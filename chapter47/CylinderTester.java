import java.util.Scanner;

public class CylinderTester {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double r, h;

        System.out.println("Input the radius: ");
        r = scan.nextDouble();
        System.out.println("Input the height: ");
        h = scan.nextDouble();

        Cylinder cylinder = new Cylinder(r, h);

        System.out.println("Surface Area: " + cylinder.surfaceArea());
        System.out.println("Volume: " + cylinder.volume());
    }
}
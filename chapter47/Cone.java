import java.util.Scanner;

public class Cone {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r, h;

        System.out.println("Input the radius: ");
        r = scan.nextDouble();

        System.out.println("Input the height: ");
        h = scan.nextDouble();

        Cone cone = new Cone(r, h);

        System.out.println("Slant Height: " + slantHeight);
        System.out.println("Angle: " + angle);
    }

    

}
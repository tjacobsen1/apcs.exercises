public class Cone {

    private double r;

    private double h;

    public Cone(double rad, double hei) {
        r = rad;
        h = hei;
    }


    public double area() {
        return Math.PI*r*(r + Math.sqrt(h*h + r*r));
    }

    public double volume() {
        return Math.PI*r*r*h/3.0;
    }
}
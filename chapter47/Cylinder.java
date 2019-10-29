public class Cylinder {
    private double r;
    private double h;

    public Cylinder(double rad, double hei) {
        r = rad;
        h = hei;
    }

    public double surfaceArea() {
        return 2*Math.PI*r*h + 2*Math.PI*r*r;
    }

    public double volume() {
        return Math.PI*r*r*h;
    }
}
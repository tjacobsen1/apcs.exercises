public class Box {
    private double width;
    private double height;
    private double length;
    private double base;

    public Box (double wid, double hei, double len) {
        width = wid;
        height = hei;
        length = len;
    }

    public Box (double side) {

    }
    
    public double width() {
        return width;
    }

    public double height() {
        return height;
    }

    public double length() {
        return length;
    }


    public double volume() {
        return width * base * height;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    public double faceArea() {
        return width * length;
    }
    
    public double topArea() {
        return height * length;
    }
    
    public double sideArea() { 
        return height * width;
    }

}
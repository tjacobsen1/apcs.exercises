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

    public Box (Box oldBox) {
        width = oldBox.width();
        height = oldBox.height();
        length = oldBox.length();
        biggerBox(oldBox);
    }

    public Box biggerBox(Box oldBox) {
        return new Box(1.25*oldBox.width(), 1.25*oldBox.height(), 1.25*oldBox.length());
    }

    public Box smallerBox(Box oldBox) {
        return new Box(oldBox.width()*0.75, oldBox.height()*0.75, oldBox.length()*0.75);
    }

    public boolean nests(Box outsideBox) {
        if(outsideBox.width() > width && outsideBox.height() > height && outsideBox.length() > length) {
            return true;
        } else {
            return false;
        }
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
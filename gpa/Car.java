public class Car {

    private String car;
    private String type;

    private int tank;
    private double time;
    private double mpg;

    public Car(String car, String type, int tank, double time) {
        this.car = car;
        this.type = type;
        this.tank = tank;
        this.time = time;
    }

    public String getCar() {
        return this.car;
    }

    public String getType() {
        return this.type;
    }

    public int getTank() {
        return this.tank;
    }

    public double getTime() {
        return this.time;
    }

    public double getMPG() {
        mpg = (60 * this.time) / (this.tank * 0.264172);
        return this.mpg;
    }

    public Boolean getFuelEfficiency() {
        if (this.type == "Sedan" && mpg >= 50) {
            return true;
        } else if (this.type == "SUV" && mpg >= 40) {
            return true;
        } else if(this.type == "Truck" && mpg >= 30) {
            return true;
        } else {
            return false;
        }
    }
}
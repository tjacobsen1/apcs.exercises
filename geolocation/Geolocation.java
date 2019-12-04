public class GPS {


    public Location location;
    public double longitude;
    public double latitude;
    public final double r = 6371;

    public class WeatherInfo(Location location, double temp) {
        this.location = location;
        this.temp = temp;
    }
    

    public Location(double latitude, double longitude, double radius) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.r = r;
    }

    public double getA() {
        return Math.pow(Math.sin(latitude/2), 2) + Math.cos(latitude)*Math
    }

    public String getName() {
        return location.getName();
    }

    public double getLong() {
        return location.getLong();
    }

    public double getLat() {
        return location.getLat();
    }

    public double getTemp() {
        return temp;
    }
}
import java.util.*;

public class Location {

    private double longitude = 0;
    private double latitude = 0;
    private String name = "";    

    public Location(double latitude, double longitude, String name) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLong() {
        return longitude;
    }

    public double getLat() {
        return latitude;
    }

    public String getName() {
        return name;
    }   

    public double findDistance(Location otherLocation) {
        double lat2 = otherLocation.getLat();
        double long2 = otherLocation.getLong();
        String name2 = otherLocation.getName();
        final double r = 6371;
        double a = (Math.sin((Math.abs(latitude - lat2)) / 2) * 
                    Math.sin((Math.abs(latitude - lat2)) / 2)) + 
                    (Math.cos(latitude) * Math.cos(lat2)) *
                    (Math.sin((Math.abs(longitude - long2)) / 2) *
                    Math.sin((Math.abs(longitude - long2)) / 2));
        
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        double d = r * c;

        return d;
    }
    
}
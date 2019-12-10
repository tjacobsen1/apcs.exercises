import java.util.*;

public class WeatherInfo {

    private Location location;
    private double temp = 0;
    
    public WeatherInfo(Location location, double temp) {
        this.location = location;
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public Location getLocation() {
        return location;
    }

    // public double CnD(WeatherInfo[] infos, int distance, double temp) {
    //     int numOfLocations = 0;
    //     for (int i =0; i < infos.length; i++) {
    //         if(this.location.findDistance(infos[i].location) < distance && infos[i].getTemp > temp) {
    //         numOfLocations++;
    //         }
    //     }
    //     return numOfLocations / infos.length;
    // }
}
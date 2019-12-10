import java.util.*;

public class WeatherDisplay {
    public static void main(String[]args) {
        Location location = new Location(40.4, -74.0, "FederalReserve");
        Location otherLocation = new Location(43.8, 18.4, "Sarajevo");
        WeatherInfo info = new WeatherInfo(location, 50.5);


        System.out.println("Location: " + info.getName() + " \nLatitude: " + 
                                          info.getLat() + " \nLongitude: " + 
                                          info.getLong() + " \nTemp: " + 
                                          info.getTemp() + " \nDistance: " + 
                                          info.getLocation().findDistance(otherLocation));

        // System.out.println("Cnd: " + info.CnD);
    }
}
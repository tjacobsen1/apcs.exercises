public class Geolocation {
    public static void main(String[]args) {
        Location location = new Location(40.42, -74.00, "FederalReserve");
        WeatherInfo info = new WeatherInfo();


        System.out.println("Location: " + info.getName() + " \nLatitude: " + 
                                          info.getLat() + " \nLongitude: " + 
                                          info.getLong() + " \nTemp: " + 
                                          info.getTemp());
    }
}
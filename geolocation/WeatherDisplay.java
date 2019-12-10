public class WeatherDisplay {
    public static void main(String[]args) {
        Location location = new Location(40.4, -74.0, "FederalReserve");
        WeatherInfo info = new WeatherInfo(location, 50.5);


        System.out.println("Location: " + info.getName() + " \nLatitude: " + 
                                          info.getLat() + " \nLongitude: " + 
                                          info.getLong() + " \nTemp: " + 
                                          info.getTemp());

        // System.out.println("Cnd: " + info.CnD);
    }
}
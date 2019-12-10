public class WeatherInfo {

    public Location location;
    double temp = 0;
    
    public WeatherInfo(Location location, double temp) {
        this.location = location;
        this.temp = temp;
    }

    public String getName() {
        return location.getName();
    }

    public double getLat() {
        return location.getLat();
    }

    public double getLong() {
        return location.getLong();
    }

    public double getTemp() {
        return temp;
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
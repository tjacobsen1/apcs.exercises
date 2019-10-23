public class Fjord {

    public static void main (String[]args) {
        Car car = new Car("Takk", "Sedan", 40, 9.5);
        Car car2 = new Car("Beklager", "Sedan", 45, 7.5);
        Car car3 = new Car("Vakker", "SUV", 60, 7.5);
        Car car4 = new Car("Stygg", "SUV", 50, 9);
        Car car5 = new Car("Vanskellig", "Truck", 60, 8.75);
        Car car6 = new Car("Lastebil", "Truck", 70, 5.5);


        System.out.println(car.getCar() + " MPG: " + car.getMPG() + " Efficiency: " + car.getFuelEfficiency());
        System.out.println(car2.getCar() + " MPG: " + car2.getMPG() + " Efficiency: " + car2.getFuelEfficiency());
        System.out.println(car3.getCar() + " MPG: " + car3.getMPG() + " Efficiency: " + car3.getFuelEfficiency());
        System.out.println(car4.getCar() + " MPG: " + car4.getMPG() + " Efficiency: " + car4.getFuelEfficiency());
        System.out.println(car5.getCar() + " MPG: " + car5.getMPG() + " Efficiency: " + car5.getFuelEfficiency());
        System.out.println(car6.getCar() + " MPG: " + car6.getMPG() + " Efficiency: " + car6.getFuelEfficiency());
    }
}
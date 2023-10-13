// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Cadillac", 4);
        Car car2 = new Car("Chevrolet", 4);


        Truck truck = new Truck("Scania", 8);
        Truck truck2 = new Truck("DAF", 6);

        Bicycle bicycle = new Bicycle("Stels", 2);
        Bicycle bicycle2 = new Bicycle("Motor", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(truck);
        station.check(truck2);
        station.check(bicycle2);
        station.check(bicycle);
    }
}
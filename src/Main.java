// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
=======
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
>>>>>>> e7c6ef1 (hw 2.3)
    }
}
public class MotorVehicle extends Vehicle {
    MotorVehicle(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void service(Vehicle vehicle) {
        super.service(vehicle);
        checkEngine();
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

public class ServiceStation implements Check {
    @Override
    public void check(Vehicle vehicle) {
        vehicle.service(vehicle);
    }
}


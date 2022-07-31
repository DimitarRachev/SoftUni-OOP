import java.text.DecimalFormat;

public class Car extends Vehicle {


    public Car(double fuel, double consumptionPerKm, double tankCapacity) {
        super(fuel, consumptionPerKm, tankCapacity);
    }

    @Override
    String drive(double distance) {
        double fuelConsumption = distance * (getConsumptionPerKm() + 0.9);
        if (fuelConsumption > getFuel()) {
            return "Car needs refueling";
        } else {
            setFuel(getFuel() - fuelConsumption);
            DecimalFormat format = new DecimalFormat("#.##");
            return String.format("Car travelled %s km", format.format(distance));
        }
    }

    @Override
    String refuel(double quantity) {
        if (quantity <= 0) {
            return "Fuel must be a positive number";
        }
        double newTotal = getFuel() + quantity;
        if (newTotal > getTankCapacity()) {
            return "Cannot fit fuel in tank";
        }
        setFuel(getFuel() + quantity );
        return null;
    }
}

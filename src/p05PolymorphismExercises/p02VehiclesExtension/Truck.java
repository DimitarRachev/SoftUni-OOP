import java.text.DecimalFormat;

public class Truck extends Vehicle {


    public Truck(double fuel, double consumptionPerKm, double tankCapacity) {
        super(fuel, consumptionPerKm, tankCapacity);
    }

    @Override
    String drive(double distance) {
        double fuelConsumption = distance * (getConsumptionPerKm() + 1.6);
        if (fuelConsumption > getFuel()) {
            return "Truck needs refueling";
        } else {
            setFuel(getFuel() - fuelConsumption);
            DecimalFormat format = new DecimalFormat("#.##");
            return String.format("Truck travelled %s km", format.format(distance));
        }
    }

    @Override
    String refuel(double quantity) {
        if (quantity <= 0) {
            return "Fuel must be a positive number";
        }
        double newTotal = getFuel() + quantity * 0.95;
        if (newTotal > getTankCapacity()) {
        return "Cannot fit fuel in tank";
        }
        setFuel(getFuel() + quantity * 0.95);
        return null;
    }
}

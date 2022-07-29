import java.text.DecimalFormat;

public class Car extends Vehicle {

    public Car(Double fuel, Double consumptionLitersPerKm) {
        super(fuel, consumptionLitersPerKm);
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
    void refuel(double quantity) {
        setFuel(getFuel() + quantity);
    }
}

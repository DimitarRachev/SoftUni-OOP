import java.text.DecimalFormat;

public class Truck extends Vehicle {

    public Truck(Double fuel, Double consumptionLitersPerKm) {
        super(fuel, consumptionLitersPerKm);
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
    void refuel(double quantity) {
        setFuel(getFuel() + quantity * 0.95);
    }
}

public abstract class Vehicle {

    private Double fuel;
    private Double consumptionPerKm;

    public Vehicle(Double fuel, Double consumptionLitersPerKm) {
        this.fuel = fuel;
        this.consumptionPerKm = consumptionLitersPerKm;
    }


   abstract String drive(double distance);
    abstract void refuel(double quantity);

    public Double getFuel() {
        return fuel;
    }

    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

    public Double getConsumptionPerKm() {
        return consumptionPerKm;
    }

    public void setConsumptionPerKm(Double consumptionPerKm) {
        this.consumptionPerKm = consumptionPerKm;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), getFuel());
    }
}

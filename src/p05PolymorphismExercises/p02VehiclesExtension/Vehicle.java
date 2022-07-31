public abstract class Vehicle {

    private double fuel;
    private double consumptionPerKm;
    private double tankCapacity;

    public Vehicle(double fuel, double consumptionPerKm, double tankCapacity) {
        this.fuel = fuel;
        this.consumptionPerKm = consumptionPerKm;
        this.tankCapacity = tankCapacity;
    }

    abstract String drive(double distance);
    abstract String refuel(double quantity);

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

    public String drive(double digit, boolean b) {
        return "Non implemented";
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

}

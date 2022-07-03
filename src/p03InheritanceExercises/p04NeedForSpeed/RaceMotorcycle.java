package p03InheritanceExercises.p04NeedForSpeed;

public class RaceMotorcycle extends Motorcycle{
    protected final static double DEFAULT_FUEL_CONSUMPTION = 8;
    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}

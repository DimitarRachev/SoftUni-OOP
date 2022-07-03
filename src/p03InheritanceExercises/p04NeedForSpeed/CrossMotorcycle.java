package p03InheritanceExercises.p04NeedForSpeed;

public class CrossMotorcycle extends Motorcycle{
    public CrossMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(super.getFuelConsumption());
    }
}

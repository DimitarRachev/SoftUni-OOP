package p03InheritanceExercises.p04NeedForSpeed;

public class Motorcycle extends Vehicle{

    public Motorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(super.getFuelConsumption());
    }
}

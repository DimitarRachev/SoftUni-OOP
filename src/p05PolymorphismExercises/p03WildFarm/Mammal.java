import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
  private  String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight,  String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    @Override
    void eat(Food food) {
        setFoodEaten(getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("###.##");
        return String.format("%s[%s, %s, %s, %d]", getAnimalType(), getAnimalName(), decimalFormat.format(getAnimalWeight()), livingRegion, getFoodEaten());
    }

    public String getLivingRegion() {
        return livingRegion;
    }
}

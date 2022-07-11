import java.text.DecimalFormat;

public class Cat extends Felime {
    String breed;

    public Cat(String animalName, String animalType, Double animalWeight,  String livingRegion, String breed) {
        super(animalName, animalType, animalWeight,  livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }


    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("###.##");
        return String.format("%s[%s, %s, %s, %s, %d]", getAnimalType(), getAnimalName(), breed, decimalFormat.format(getAnimalWeight()), getLivingRegion(), getFoodEaten());
    }
}

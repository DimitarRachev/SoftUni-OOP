public class Zebra extends Mammal{

    public Zebra(String animalName, String animalType, Double animalWeight,   String livingRegion) {
        super(animalName, animalType, animalWeight,  livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Zs");
    }

    @Override
    void eat(Food food) {
        if (food.getClass() == Meat.class) {
            System.out.println("Zebras are not eating that type of food!");
        } else {
            setFoodEaten(getFoodEaten()+ food.getQuantity());
        }
    }
}

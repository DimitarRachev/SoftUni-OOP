public class Mouse extends Mammal{

    public Mouse(String animalName, String animalType, Double animalWeight,  String livingRegion) {
        super(animalName, animalType, animalWeight,  livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    void eat(Food food) {
        if (food.getClass() == Meat.class) {
            System.out.println("Mice are not eating that type of food!");
        } else {
            setFoodEaten(getFoodEaten()+ food.getQuantity());
        }
    }
}

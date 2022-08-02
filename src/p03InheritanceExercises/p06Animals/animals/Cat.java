package p03InheritanceExercises.p06Animals.animals;

public class Cat extends Animal{

    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "Meow meow";
    }
}

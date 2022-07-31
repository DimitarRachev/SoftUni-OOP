package p03InheritanceExercises.p06Animals.animals;

import java.util.Set;

public class Animal {
     String sound;
     String name;
     int age;
     String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    private void setGender(String gender) {
        Set<String>valid = Set.of("Male", "Female");
        if (!valid.contains(gender)) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    public String produceSound() {
        return sound;
    }

    @Override
    public String toString() {
        String sb = this.getClass().getSimpleName() + System.lineSeparator() +
                name + " " + age + " " +
                gender + System.lineSeparator() +
                produceSound();
       return sb;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

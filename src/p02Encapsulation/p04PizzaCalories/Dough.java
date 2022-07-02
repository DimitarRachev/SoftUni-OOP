package p02Encapsulation.p04PizzaCalories;

import java.util.Set;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    private void setFlourType(String flourType) {
        Set<String> flours = Set.of("White", "Wholegrain");
        if (flours.contains(flourType)) {
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

    }

    private void setBakingTechnique(String bakingTechnique) {
        Set<String> backing = Set.of("Crispy", "Chewy", "Homemade");
        if (backing.contains(bakingTechnique)) {
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public double calculateCalories() {
        double flourModifier = 1;
        switch (flourType) {
            case "White":
                flourModifier = 1.5;
                break;
            case "Wholegrain":
                flourModifier = 1;
                break;

        }

        double backingModifier = 1;
        switch (bakingTechnique) {
            case "Crispy":
                backingModifier = 0.9;
                break;
            case "Chewy":
                backingModifier = 1.1;
                break;
            case "Homemade":
                backingModifier = 1;
                break;
        }
        return weight * 2 * flourModifier * backingModifier;

    }
}

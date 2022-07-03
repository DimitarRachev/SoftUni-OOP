package p04InterfacesAndAbstractionExercises.p03BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        List<Birthable> birthables = new ArrayList<>();

        while (!"End".equals(input = scanner.nextLine())) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Pet":
                    birthables.add(new Pet(tokens[1], tokens[2]));
                    break;
                case "Citizen":
                    birthables.add(new Citizen(tokens[1], Integer.parseInt(tokens[2]),
                            tokens[3], tokens[4]));
                    break;
            }
        }
        String year = scanner.nextLine();
        birthables.stream().filter(b -> b.getBirthDate().endsWith(year))
                .forEach(s -> System.out.println(s.getBirthDate()));
    }
}

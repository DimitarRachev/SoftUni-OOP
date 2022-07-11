import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animlals = new ArrayList<>();
        String line;
        while(!"End".equals(line = scanner.nextLine())) {
            String[] parts = line.split("\\s+");
            Animal animal = null;
            switch(parts[0]) {
                case "Cat":
                    animal = new Cat(parts[1], parts[0], Double.parseDouble(parts[2]),  parts[3], parts[4]);
                    break;
                case "Tiger":
                        animal = new Tiger(parts[1], parts[0], Double.parseDouble(parts[2]),  parts[3]);
                    break;
                case "Zebra":
                    animal = new Zebra(parts[1], parts[0], Double.parseDouble(parts[2]),  parts[3]);
                    break;
                case "Mouse":
                    animal = new Mouse(parts[1], parts[0], Double.parseDouble(parts[2]), parts[3]);
                    break;
            }

            animal.makeSound();
            parts = scanner.nextLine().split("\\s+");
            Food food = null;
            if (parts[0].equals("Vegetable")) {
                food = new Vegetable(Integer.parseInt(parts[1]));
            } else {
                food = new Meat(Integer.parseInt(parts[1]));
            }

            animal.eat(food);
           animlals.add(animal);
        }
        animlals.forEach(a ->{

            System.out.println(a);
        });
    }
}

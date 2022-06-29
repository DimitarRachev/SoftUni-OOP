package p02Encapsulation.p03ShoppingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] peopleInput = scanner.nextLine().split(";");
        String[] productInput = scanner.nextLine().split(";");
        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();

        for (String s : peopleInput) {
            String[] input = s.split("=");
            people.put(input[0],new Person(input[0],Integer.parseInt(input[1])));
        }

        for (String s : productInput) {
            String[] input = s.split("=");
            try {
                products.put(input[0], new Product(input[0], Integer.parseInt(input[1])));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        String input;
        while(!"END".equals(input = scanner.nextLine())) {
            String[] parts = input.split("\\s+");
            Person person = people.get(parts[0]);
            Product product = products.get(parts[1]);
            try {
                person.buyProduct(product);
                System.out.println(person.getName() + " bought " + product.getName());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        people.values().forEach(System.out::println);
    }
}

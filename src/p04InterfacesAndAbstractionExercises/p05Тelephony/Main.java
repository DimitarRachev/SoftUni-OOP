package p04InterfacesAndAbstractionExercises.p05Тelephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> url = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Smartphone smartphone = new Smartphone(numbers, url);

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());
    }
}

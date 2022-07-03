package p04InterfacesAndAbstractionExercises.p04FoodShortage;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> buyerMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            if (input.length == 3) {
                buyerMap.put(input[0], new Rebel(input[0], Integer.parseInt(input[1])
                , input[2]));
            } else {
                buyerMap.put(input[0], new Citizen(input[0], Integer.parseInt(input[1]),
                        input[2], input[3]));
            }
        }

        String name;
        int sum = 0;
        while(!"End".equals(name = scanner.nextLine())) {
            if (buyerMap.containsKey(name)) {
                sum += buyerMap.get(name).getFood();
            }
        }
        System.out.println(sum);
    }
}


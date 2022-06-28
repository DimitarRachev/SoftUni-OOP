package p01Exersice.p04TrafficLights;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TrafficLight> lights = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(String::toUpperCase)
                .map(TrafficLight::valueOf).collect(Collectors.toList());
        ;
        int repetition = scanner.nextInt();

        for (int i = 0; i < repetition; i++) {
            for (int j = 0; j < lights.size(); j++) {
                TrafficLight light = lights.get(j);
                switch (light) {
                    case RED:
                        light = TrafficLight.GREEN;
                        break;
                    case GREEN:
                            light = TrafficLight.YELLOW;
                        break;
                    case YELLOW:
                        light = TrafficLight.RED;
                }
                System.out.print(light.name() + " ");
                lights.set(j, light);
            }
            System.out.println();
        }

    }
}

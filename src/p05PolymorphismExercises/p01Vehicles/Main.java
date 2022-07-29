import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInput = scanner.nextLine().split("\\s+");
        Car car = new Car(Double.parseDouble(carInput[1]), Double.parseDouble(carInput[2]));
        String[] truckInput = scanner.nextLine().split("\\s+");
        Truck truck = new Truck(Double.parseDouble(truckInput[1]), Double.parseDouble(truckInput[2]));
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            double digit = Double.parseDouble(input[2]);
            if (input[0].equals("Drive")) {
                if (input[1].equals("Car")) {
                    System.out.println(car.drive(digit));
                } else {
                    System.out.println(truck.drive(digit));
                }
            } else {
                if (input[1].equals("Car")) {
                    car.refuel(digit);
                } else {
                    truck.refuel(digit);
                }
            }
        }
        System.out.println(car);
        System.out.println(truck);
    }
}

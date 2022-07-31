import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Vehicle>vehicles = new LinkedHashMap<>();
        for (int i = 0; i < 3; i++) {
            String[] carInput = scanner.nextLine().split("\\s+");
                    switch (carInput[0]) {
                        case "Car":
                            vehicles.put("Car", new Car(Double.parseDouble(carInput[1]), Double.parseDouble(carInput[2]), Double.parseDouble(carInput[3])));
                            break;
                        case "Truck":
                            vehicles.put("Truck", new Truck(Double.parseDouble(carInput[1]), Double.parseDouble(carInput[2]), Double.parseDouble(carInput[3])));
                            break;
                        case "Bus":
                            vehicles.put("Bus", new Bus(Double.parseDouble(carInput[1]), Double.parseDouble(carInput[2]), Double.parseDouble(carInput[3])));
                            break;
                    }
        }


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            double digit = Double.parseDouble(input[2]);
            if (input[1].equals("Car")) {
                if (input[0].equals("Drive")) {
                    System.out.println(vehicles.get("Car").drive(digit));
                } else if (input[0].equals("Refuel")){
                    String refuel = vehicles.get("Car").refuel(digit);
                    if (refuel != null) {
                        System.out.println(refuel);
                    }
                }
            } else if (input[1].equals("Truck")) {
                if (input[0].equals("Drive")) {
                    System.out.println(vehicles.get("Truck").drive(digit));
                } else if (input[0].equals("Refuel")) {
                    String refuel =  vehicles.get("Truck").refuel(digit);
                    if (refuel != null) {
                        System.out.println(refuel);
                    }
                }
            } else if (input[1].equals("Bus")){
                if (input[0].equals("DriveEmpty")) {
                    System.out.println(vehicles.get("Bus").drive(digit));
                } else if (input[0].equals("Drive")) {
                    System.out.println(vehicles.get("Bus").drive(digit, true));
                } else if (input[0].equals("Refuel")){
                    String refuel =  vehicles.get("Bus").refuel(digit);
                    if (refuel != null) {
                        System.out.println(refuel);
                    }
                }
            }
        }
        System.out.println(vehicles.get("Car"));
        System.out.println(vehicles.get("Truck"));
        System.out.println(vehicles.get("Bus"));

    }
}

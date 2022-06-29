package p02Encapsulation.p01ClassBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        Box box;
        try {
            box = new Box(length, width, height);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("Surface Area - " + box.calculateSurfaceArea());
        System.out.println("Lateral Surface Area - " + box.calculateLateralSurfaceArea());
        System.out.println("Volume – " + box.calculateVolume());
    }
}

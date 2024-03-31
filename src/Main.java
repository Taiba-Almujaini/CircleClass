import object.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double cRadius = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the color of the circle: ");
        String cColor = scanner.nextLine();

        Circle circle = new Circle(cRadius, cColor);

        // Displaying information about the circle
        System.out.println("\nCircle Information:");
        System.out.println("Radius: " + circle.getCircleRadius());
        System.out.println("Color: " + circle.getCircleColor());
        System.out.println("Area: " + circle.calculateArea());
    }
}
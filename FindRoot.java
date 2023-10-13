package cus1115;

import java.util.Scanner;

public class FindRoot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        // Calculate delta value (b*b - 4*a*c)
        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            // If delta < 0: no root
            System.out.println("There are no real roots.");
        } else if (delta == 0) {
            // If delta == 0: x1 = x2 = -b / (2 * a)
            double x1 = -b / (2 * a);
            System.out.println("The root is x1 = x2 = " + x1);
        } else {
            // If delta > 0
            // Calculate x1 and x2
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The roots are x1 = " + x1 + " and x2 = " + x2);
        }

        scanner.close();
    }
}
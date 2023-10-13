package cus1115;

import java.util.Scanner;

public class Richter2 {

    public static void main(String[] args) {
        // Richter Scale Categories:
        // >= 8.0 too bad
        // >= 7.0 < 8.0 bad enough
        // >= 6.0 < 7.0 hurts
        // >= 4.5 < 6.0 windows will shudder
        // < 4.5 it's safe

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Richter value: ");
        double richter = input.nextDouble();

        // Determine the category based on Richter value
        if (richter >= 8.0) {
            System.out.println("Way too bad!!");
        } else if (richter >= 7.0 && richter < 8.0) {
            System.out.println("It hurts!");
        } else if (richter >= 6.0 && richter < 7.0) {
            System.out.println("Bad enough!");
        } else if (richter >= 4.5 && richter < 6.0) {
            System.out.println("Windows will shudder!");
        } else {
            System.out.println("It is kinda safe...");
        }
    }
}

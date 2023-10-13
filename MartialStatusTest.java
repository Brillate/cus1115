package cus1115;

import java.util.Scanner;

public class MartialStatusTest {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        System.out.print("Are you married? ");
        String married = input.next();

        System.out.print("Are you single? ");
        String single = input.next();

        System.out.print("Are you divorced? ");
        String divorced = input.next();

        // Check each question separately with separate if statements
        if (married.equalsIgnoreCase("Yes") || married.equalsIgnoreCase("Yes.") ||
            married.equalsIgnoreCase("yes")) {
            System.out.println("You are married.");
        }

        if (single.equalsIgnoreCase("Yes") || single.equalsIgnoreCase("Yes.") ||
            single.equalsIgnoreCase("yes")) {
            System.out.println("You are single.");
        }

        if (divorced.equalsIgnoreCase("Yes") || divorced.equalsIgnoreCase("Yes.") ||
            divorced.equalsIgnoreCase("yes")) {
            System.out.println("You are divorced.");
        }

        if (married.equalsIgnoreCase("No") || married.equalsIgnoreCase("No.") ||
            married.equalsIgnoreCase("no")) {
            System.out.println("You are not married.");
        }

        if (single.equalsIgnoreCase("No") || single.equalsIgnoreCase("No.") ||
            single.equalsIgnoreCase("no")) {
            System.out.println("You are not single.");
        }

        if (divorced.equalsIgnoreCase("No") || divorced.equalsIgnoreCase("No.") ||
            divorced.equalsIgnoreCase("no")) {
            System.out.println("You are not divorced.");
        }

        // Close the input Scanner to release resources
        input.close();
    }
}

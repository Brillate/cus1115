package cus1115;

import java.util.Scanner;

public class GenerateEmailAddress {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their first name
        System.out.print("First Name: ");
        String firstName = input.next();

        // Prompt the user to enter their last name
        System.out.print("Last Name: ");
        String lastName = input.next();

        // Calculate the total size of the first name and last name combined
        int totalSize = firstName.length() + lastName.length();

        // Generate the email address by concatenating the first name, 
        // the first character of the last name, the total size, and the domain
        String email = firstName + lastName.charAt(0) + totalSize + "@stjohns.edu";

        // Display the generated email address
        System.out.println(email);
    }
}

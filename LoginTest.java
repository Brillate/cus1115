package cus1115;

import java.util.Scanner;

public class LoginTest {

    public static void main(String[] args) {
        // This program performs a basic login authentication:
        // 1. Ask the user to enter a username and password.
        // 2. Check them against pre-defined username/password values.
        // 3. If both match, print "you are in." Otherwise, print "login failed."

        // Define the pre-defined username and password
        String actualUsername = "brill";
        String actualPassword = "pringles";

        // Create a scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a username (not case-sensitive)
        System.out.print("Username: ");
        String username = input.next(); // Use equalsIgnoreCase() to compare

        // Prompt the user to enter a password (case-sensitive)
        System.out.print("Password: ");
        String password = input.next(); // Use equals() to compare

        // Check if the entered username matches the pre-defined username (case-insensitive)
        if (username.equalsIgnoreCase(actualUsername)) {
            // If the usernames match, check if the entered password matches the pre-defined password
            if (actualPassword.equals(password)) {
                // If both username and password match, print "You are in!"
                System.out.println("You are in!");
            } else {
                // If the password does not match, print "Wrong password!"
                System.out.println("Wrong password!");
            }
        } else {
            // If the username does not match, print "Wrong username!"
            System.out.println("Wrong username!");
        }
    }
}

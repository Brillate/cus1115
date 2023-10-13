package cus1115;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Initialize a string variable
        String name = "Brandon";

        // Calculate the length of the name string
        int n = name.length();

        // Print the length of the name
        System.out.println("Your name is " + n + " characters long.");

        // Escape characters:
        // \" prints a double quotation mark
        // \t inserts a tab
        // \n goes to a new line
        // \\ prints a backslash
        System.out.println("She said \"I live around, how about you?\"");

        // Print a formatted table
        System.out.println("Brandon \t Pinnick \nJohn \t \t Doe \nKelly O. \t Brown");
        
        String str = "Hello!";
        String sub1 = str.substring(5);
        System.out.println(sub1);
        
        // Close the Scanner
        input.close();
    }
}

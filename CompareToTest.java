package cus1115;

import java.util.Scanner;

public class CompareToTest {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter two names
        System.out.print("Enter a name: ");
        String name1 = input.next();
        
        System.out.print("Enter another name: ");
        String name2 = input.next();
        
        // Compare the two names using the compareTo method
        if (name1.compareTo(name2) == 0) {
            // If the result is 0, the names are the same
            System.out.println("They are the same.");
        } else if (name1.compareTo(name2) > 0) {
            // If the result is greater than 0, name1 is greater than name2
            System.out.println(name1 + " is greater than " + name2);
        } else {
            // If the result is less than 0, name1 is less than name2
            System.out.println(name1 + " is less than " + name2);
        }
        
        // Close the input Scanner to release resources
        input.close();
    }
}

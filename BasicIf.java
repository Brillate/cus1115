package cus1115;

import java.util.Scanner;

public class BasicIf {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter their marital status
        System.out.print("Are you married? Yes or no? ");
        String answer = input.next();
        
        // Check if the user's response (case-insensitive) is "Yes"
        if (answer.equalsIgnoreCase("Yes")) {
            // If "Yes," print a message assuming they are married
            System.out.println("You said you were married, is that correct?");
        } else {
            // If not "Yes," assume they are not married and print a message
            System.out.println("You don't look like a single person...");
        }
        
        // Close the input Scanner to release resources
        input.close();
    }
}

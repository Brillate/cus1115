package cus1115;
import java.util.Scanner; // Import the Scanner class

public class SimpleCalculator {

    public static void main(String[] args) {
        // 1. Create a scanner
        Scanner keyboard = new Scanner(System.in);

        // 2. Ask user to enter the first integer
        System.out.print("Enter the first number: ");

        // 3. Read the first integer from the keyboard
        int firstNum = keyboard.nextInt(); // Reads an integer
        
        // 4. Ask for a second integer and read from keyboard
        System.out.print("Enter another number: ");
        
        // 4.5 Read the second integer from the keyboard
        int secondNum = keyboard.nextInt(); // Reads another integer
        
        // 5. Calculate the sum of the first and second integers
        int sum = firstNum + secondNum; // Calculates the sum of integers
        
        // 6. Print the result on the screen
        System.out.println(firstNum + " + " + secondNum + " = " + sum); // Prints the sum of integers

        // 7. Close the scanner to prevent resource leak
        keyboard.close();
    }
}

package cus1115;
import java.util.Scanner;

public class SayHello {

    public static void main(String[] args) {
        // 1. Create a scanner to read from keyboard
        Scanner keyboard = new Scanner(System.in);

        // 2. Ask user his/her first name
        System.out.print("What is your first name? ");

        // 2.5 Read the name from the keyboard
        String firstName = keyboard.nextLine();
        
        // 2.6 Ask user his/her last name
        System.out.print("What is your last name? ");
        
        // 2.7 Read the last name from the keyboard
        String lastName = keyboard.nextLine();

        // 3. Print a greeting message
        System.out.println("Hello, " + firstName + " " + lastName + "! Nice to meet you!");
        
        // 3.5 Ask user how old he/she is
        System.out.print("How old are you? ");
        
        // 3.6 Read the age from the keyboard
        String age = keyboard.nextLine();
        
        // 3.7 Print another greeting message
        System.out.println("Wow! You're " + age + " years old!");

        // 4. Close the scanner to prevent resource leak
        keyboard.close();
    }
}

package cus1115;

import java.util.Scanner;

public class ScannerTests {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read an integer and print
        System.out.print("Type an integer: ");
        int yourInt = input.nextInt();
        
        System.out.println("Your Integer: " + yourInt);

        // Read a double and print
        System.out.print("Type a double: ");
        double yourDouble = input.nextDouble();
        System.out.println("Your Double: " + yourDouble);

        // Clears the newline character from the previous input
        input.nextLine();

        // Read a word (string without spaces) and print
        System.out.print("Type a word: ");
        String yourWord = input.next();
        System.out.println("Your Word: " + yourWord);

        // Read a line (string with spaces) and print
        System.out.print("Type a line: ");
        input.nextLine(); // Clears the newline character
        String yourLine = input.nextLine();
        System.out.println("Your Line: " + yourLine);

        // Close the Scanner
        input.close();
    }
}

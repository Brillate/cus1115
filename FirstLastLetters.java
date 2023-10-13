package cus1115;

import java.util.Scanner;

public class FirstLastLetters {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = input.next(); // next() reads one word!

        // Display the first letter of the entered word
        System.out.println("First letter: " + word.charAt(0));

        // Display the last letter of the entered word
        System.out.println("Last letter: " + word.charAt(word.length() - 1));
    }
}

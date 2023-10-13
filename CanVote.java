package cus1115;

import java.util.Scanner;

public class CanVote {
    public static void main(String[] args) {
        // 1. Prompt the user to enter their name
        // 2. Prompt the user to enter their age
        // 3. If the user is 18 or older, print "you can vote"
        // 4. If the user is younger than 18, print "too young to vote!"

        // Create a scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("What is your name?");
        String name = input.next();

        // Prompt the user to enter their age
        System.out.println("How old are you? ");
        int age = input.nextInt();

        // Check if the user is 18 or older
        if (age >= 18) {
            // true block: User can vote
            System.out.println("Great, you can vote!");
        } else {
            // false block: User is too young to vote
            System.out.println("Sorry, you are too young to vote!");
        }
    }
}

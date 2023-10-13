package cus1115;

/**
 * This application demonstrates variable declarations and assignments in Java.
 * Author: Brandon Pinnick
 */

public class Test {
    public static void main(String[] args) {
        
        int age = 6; // Declaring and initializing an age variable
        
        String name; // Declaring a name variable
        name = "John"; // Assigning a value to the name variable
        
        int cans = 6; // Declaring and initializing an integer variable
        int bottles = 10;
        int total = cans + bottles; // Calculating the total
        // bottles = 1; // Uncommenting this line would update the bottles variable
        // int volume = "2"; // This line would result in a compilation error
        int cansPerPack; // Declaring an integer variable without initializing it
        int dollars, cents; // Declaring multiple variables in a single line
        
        int totalVolume;
        totalVolume = 50;
        
        final double PI = 3.14159; // Constant variable; cannot be changed
        
        int counter, counter1, counter2, counter3, counter4, counter5;
        counter1 = 1;
        counter2 = 2;
        counter4 = 4;
        counter5 = 5;
        counter = counter1 + 1; // Long-hand version
        counter2++; // Short-hand version
        counter3 = counter4 - 1; // Long-hand version
        counter5--; // Short-hand version
        
        int result = 7 / 4; // THe value of result will be 1
        int remainder = 7 % 4; // The value of remainder will be 3
    }
}

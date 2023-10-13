package cus1115;

public class ConditionalOperatorTest {
    public static void main(String[] args) {
        // Define the floor and actualFloor variables
        int floor = 12;
        int actualFloor;

        // The commented-out code below is an equivalent if-else statement:
        /*
        if (floor < 13) {
            actualFloor = floor - 1;
        }
        else {
            actualFloor = floor;
        }
        */

        // Use the conditional (ternary) operator to achieve the same result
        // If floor is greater than 13, subtract 1 from floor; otherwise, keep it as it is
        actualFloor = (floor > 13) ? floor - 1 : floor;

        // Display the value of actualFloor
        System.out.println("Actual Floor: " + actualFloor);
    }
}

package normalDistribution;

import java.util.Scanner;


/**
 * Main runner class for displaying information and graphs relating to
 * normal distribution.
 *
 * @Author Bjorn Rian
 */
public class UserInteraction {

    /**
     * The main method displays the menu and takes input from the user. The switch
     * function chooses the correct output for the user based on the input value.
     *
     * @param args
     */
    public static void main(String[] args) {
        printMenu();
        int choice = validateInput(0, 4);
        switch (choice) {
        case 0:
            System.out.println("Goodbye World!");
            System.exit(0);
        case 1:
            System.out.println("Enter x value:");
            int value = validateInput(0, 700);
            Calculations.findYValue(value);
            break;
        case 2:
            System.out.println("Enter desired number of std dev's (integer, 1-4):");
            int numStdDevsArea = validateInput(0, 4);
            Calculations.estimateArea(numStdDevsArea);
            break;
        case 3:
            DrawCurve.drawStandardCurve();
            break;
        case 4:
            System.out.println("Enter desired number of std dev's (integer, 1-4):");
            int numStdDevs = validateInput(0, 4);
            DrawCurve.drawShadedCurve(numStdDevs);
            break;
        }
    }

    /**
     * Prints a menu for the user with instructions on how to navigate through the program.
     */
    private static void printMenu() {
        System.out.println("---------------------------------");
        System.out.println("    Normal Distribution Menu     ");
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("1. Find y value for a specified x value (integer only)");
        System.out.println("2. Estimate area +/- n std dev's");
        System.out.println("3. Draw Curve");
        System.out.println("4. Draw curve with std dev shading");
        System.out.println();
        System.out.println("0. EXIT the program");
        System.out.println();
        System.out.println("Enter your choice: (integer, 0-4)");
    }

    /**
     * This validates that the input received from the user is an integer in the valid range.
     *
     * @param minValue
     * @param maxValue
     * @return Returns the received input if valid.
     */
    private static int validateInput(int minValue, int maxValue) {
        Scanner userIn = new Scanner(System.in);
        int inputValue = -1;

        while (true) {
            boolean invalidInput = false;
            String nextLine = userIn.nextLine();
            try {
                inputValue = Integer.parseInt(nextLine);
            } catch (NumberFormatException nfe) {
                invalidInput = true;
            }
            if (inputValue < minValue || inputValue > maxValue) {
                invalidInput = true;
            }
            if (invalidInput) {
                System.out.println("Error - choose an integer between " + minValue + "-" + maxValue + ":");
            } else {
                break;
            }
        }
        return inputValue;
    }
}

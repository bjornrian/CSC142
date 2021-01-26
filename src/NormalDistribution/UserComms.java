package NormalDistribution;
import java.util.Scanner;

public class UserComms {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
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
        while (!userIn.hasNextInt() || userIn.nextInt() < 0 || userIn.nextInt() > 4) {
                userIn.nextLine();
                System.out.println("Error - choose an integer between 0-4:");
        }
        int choice = userIn.nextInt();
        switch (choice) {
        case 0:
            System.out.println("Goodbye World!");
            System.exit(0);
        case 1:
            System.out.println("Enter x value:");
            while (!userIn.hasNextInt() || userIn.nextInt() < 0 || userIn.nextInt() > 700) {
                userIn.nextLine();
                System.out.println("Error - choose an integer between 0-700:");
            }
            int value = userIn.nextInt();
            Calculations.findYValue(value);
            break;
        case 2:
            System.out.println("Enter desired number of std dev's (integer, 1-4):");
            while (!userIn.hasNextInt() || userIn.nextInt() < 0 || userIn.nextInt() > 4) {
                userIn.nextLine();
                System.out.println("Error - choose an integer between 0-4:");
            }
            int numStdDevsArea = userIn.nextInt();
            Calculations.estimateArea(numStdDevsArea);
            break;
        case 3:
            DrawCurve.drawStandardCurve();
            break;
        case 4:
            System.out.println("Enter desired number of std dev's (integer, 1-4):");
            while (!userIn.hasNextInt() || userIn.nextInt() < 0 || userIn.nextInt() > 4) {
                userIn.nextLine();
                System.out.println("Error - choose an integer between 0-4:");
            }
            int numStdDevs = userIn.nextInt();
            DrawCurve.drawShadedCurve(numStdDevs);
            break;
        }
    }
}

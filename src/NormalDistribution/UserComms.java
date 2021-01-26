package NormalDistribution;
import java.util.Scanner;

import static NormalDistribution.Calculations.estimateArea;
import static NormalDistribution.Calculations.findYValue;
import static NormalDistribution.DrawCurve.drawStandardCurve;

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
        System.out.println("Enter your choice: (integer, 1-4)");
        int choice = userIn.nextInt();
        switch (choice) {
        case 1:
            System.out.println("Enter x value:");
            int value = userIn.nextInt();
            findYValue(value);
            break;
        case 2:
            System.out.println("Enter desired number of std dev's (integer, 1-4):");
            int numStdDevsArea = userIn.nextInt();
            estimateArea(numStdDevsArea);
            break;
        case 3:
            drawStandardCurve();
            break;
        case 4:
            System.out.println("Enter desired number of std dev's (integer, 1-4):");
            int numStdDevs = userIn.nextInt();
            //drawShadedCurve(numStdDevs);
            break;
        }

    }
}

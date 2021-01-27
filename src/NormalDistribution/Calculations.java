package NormalDistribution;

import java.text.DecimalFormat;

public class Calculations {
    public static String findYValue(int x) {
        String pattern = "#.######";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        double yValue = calculateNormalDistribution(x);
        String formattedValue = decimalFormat.format(yValue);
        System.out.println("The y-value attributed to this x-value is: " + formattedValue);
        return formattedValue;
    }

    private static double calculateNormalDistribution(int x) {
        return 1 / (100 * (Math.sqrt(2 * Math.PI))) * Math.pow(Math.E, -(Math.pow((x - 350), 2)) / 20000);
    }

    public static void estimateArea(int numStdDev) {
        double shadedArea = 0;
        for (int x = 350 - numStdDev * 100; x <= 350 + numStdDev * 100; x++) {
            double yValue = (calculateNormalDistribution(x));
            shadedArea += yValue;
        }
        String pattern = "##.######";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String format = decimalFormat.format(shadedArea);
        System.out.println("The estimated area with " + numStdDev + " standard deviation/s is: ~" + format);
    }
}


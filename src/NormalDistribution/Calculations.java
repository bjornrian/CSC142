package NormalDistribution;

import java.text.DecimalFormat;

public class Calculations {
    public static void findYValue(int x) {
        String pattern = "#.####";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        double yValue = (1/(100 * (Math.sqrt(2 * Math.PI))) * Math.pow(Math.E, - (Math.pow((x - 350), 2)) / 20000));
        String format = decimalFormat.format(yValue);
        System.out.println("The y-value attributed to this x-value is: " + format);

    }

    public static void estimateArea(int numStdDev) {
        double shadedArea = 0;
        for (int x = 350 - numStdDev * 100; x <= 350 + numStdDev * 100; x++) {
            double yValue = (1/(100 * (Math.sqrt(2 * Math.PI))) * Math.pow(Math.E, - (Math.pow((x - 350), 2)) / 20000));
            shadedArea += yValue;
        }
        String pattern = "##.####";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String format = decimalFormat.format(shadedArea);
        System.out.println("The estimated area with " + numStdDev + " standard deviation/s is: ~" + format);
    }
}


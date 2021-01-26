package NormalDistribution;

import java.text.DecimalFormat;

public class Calculations {
    public static void findYValue(int x) {
        String pattern = "#.####";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        double yValue = (1/(100 * (Math.sqrt(2 * Math.PI))) * Math.pow(Math.E, - (Math.pow((x - 350), 2)) / 20000));
        String format = decimalFormat.format(yValue);
        System.out.println("The y-value attributed to this x-value is " + format);

    }

    public static void estimateArea(int numStdDev) {
        for (int x = 350 - numStdDev * 100; x <= 350 + numStdDev * 100; x++) {
            double yValue = (1/(100 * (Math.sqrt(2 * Math.PI))) * Math.pow(Math.E, - (Math.pow((x - 350), 2)) / 20000));
        }
    }
}


package normalDistribution;

import java.text.DecimalFormat;

/**
 * This class has two methods that calculate two seperate things. The first method finds a y-value on the graph from a given
 * x value. The second method finds the area that is under the curve of the graph based off of a given amount of standard
 * deviations.
 *
 * @Author Bjorn Rian
 */
public class Calculations {
    public static String findYValue(int x) {
        String pattern = "#.######"; //On 1/24, Mr. Barry said that having 6 decimal spaces would make more sense.
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        double yValue = calculateNormalDistribution(x);
        String formattedValue = decimalFormat.format(yValue);
        System.out.println("The y-value attributed to this x-value is: " + formattedValue);
        return formattedValue;
    }

    /**
     * This method estimates the area under the graph when there is a specified amount of standard deviations.
     *
     * @param numStdDev Number of standard deviations (1-4)
     */
    public static String estimateArea(int numStdDev) {
        double shadedArea = 0;
        for (int x = 350 - numStdDev * 100; x <= 350 + numStdDev * 100; x++) {
            double yValue = (calculateNormalDistribution(x));
            shadedArea += yValue;
        }
        String pattern = "##.######";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String format = decimalFormat.format(shadedArea);
        System.out.println("The estimated area with " + numStdDev + " standard deviation/s is: ~" + format);
        return format;
    }

    /**
     * This method solely returns the y-value on the normal distribution curve graph from the given x parameter.
     *
     * @param x
     * @return
     */
    private static double calculateNormalDistribution(int x) {
        return 1 / (100 * (Math.sqrt(2 * Math.PI))) * Math.pow(Math.E, -(Math.pow((x - 350), 2)) / 20000);
    }
}


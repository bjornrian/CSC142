package NormalDistribution;

public class Calculations {
    public static void findYValue(int x) {
        float yValue = (float) (1/(100 * (Math.sqrt(2 * Math.PI))) * Math.pow(Math.E, - (Math.pow((x - 350), 2)) / 20000));
        System.out.println("The y-value attributed to this x-value is " + yValue);
    }

    public static void estimateArea(int numDev) {

    }
}

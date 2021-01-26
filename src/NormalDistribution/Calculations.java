package NormalDistribution;

public class Calculations {
    public static void findYValue(int x) {
        int yCoordinate = (int) Math.round((1.0)/100*Math.sqrt(2*Math.PI) *
                Math.pow(Math.E, -Math.pow((x - 350), 2)/20000));
        System.out.println("The y-value attributed to this x-value is " + yCoordinate);
    }
    public static void estimateArea(int numDev) {

    }
}

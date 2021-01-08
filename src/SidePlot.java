public class SidePlot {
    public static void main(String[] Args) {
        plotXSquaredPlus2(-5, 5);
        plotAbsXTimes3(-6, 6);
        plotNegXSquaredPlus25(-5, 5);
        plotSinWave(-11, 11);
    }

    public static void plotXSquaredPlus2(int minX, int maxX) {
        System.out.println("Calling method plotXSquaredPlus2 with parameters " + minX + " and " + maxX);
    }

    public static void plotAbsXTimes3(int minX, int maxX) {
        System.out.println("Calling method plotAbsXTimes3 with parameters " + minX + " and " + maxX);
    }

    public static void plotNegXSquaredPlus25(int minX, int maxX) {
        System.out.println("Calling method plotNegXSquaredPlus25 with parameters " + minX + " and " + maxX);
    }

    public static void plotSinWave(int minX, int maxX) {
        System.out.println("Calling method plotSinWave with parameters " + minX + " and " + maxX);
    }
}

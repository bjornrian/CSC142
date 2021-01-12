public class SidePlot {

    public static final char PLOT_CHARACTER = 'x';
    public static final char FILL_CHARACTER = (char)183;

    public static void main(String[] Args) {
        System.out.println("Sideways Plot:");
        plotXSquaredPlus2(-5, 5);
        plotAbsXTimes3(-6, 6);
        plotNegXSquaredPlus25(-5, 5);
        plotSinWave(-11, 11);
    }

    private static void plotXSquaredPlus2(int minX, int maxX) {
        System.out.println("y = x^2+2 where, " + minX + "<=x<=" + maxX);
        int area = 0;
        int highest_y_value = 0;
        for (int x = minX; x <= maxX; x++) {
            int y = x*x+2;
            if (y >= highest_y_value) {
                highest_y_value = y;
            }
            for (int h = -2; h < y; h++) {
                area ++;
                if (h < 0 & x == 0) {
                    System.out.print("-");
                    area --;
                }
                if (h < 0 & x != 0) {
                    System.out.print(" ");
                    area --;
                }
                if (h == 0 & x != 0) {
                    System.out.print("|");
                }
                if (h == 0 & x == 0) {
                    System.out.print("+");
                }
                if (h > 0 & x != 0) {
                    System.out.print(FILL_CHARACTER);
                }
                if (h > 0 & x == 0) {
                    System.out.print("-");
                }
            }
            System.out.print(PLOT_CHARACTER);
            if (x == 0) {
                for (int i = 0; i < highest_y_value - y; i++) {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        System.out.println("The area under the plot is " + area);
        System.out.println();
    }

    private static void plotAbsXTimes3(int minX, int maxX) {
        System.out.println("y = |x|*3, where " + minX + "<=x<=" + maxX);
        int area = 0;
        int highest_y_value = 0;
        for (int x = minX; x <= maxX; x++) {
            int y = Math.abs(x)*3;
            if (y >= highest_y_value) {
                highest_y_value = y;
            }
            for (int h = -2; h < y; h++) {
                if (h < 0 & x == 0) {
                    System.out.print("-");
                    area --;
                }
                if (h < 0 & x != 0) {
                    System.out.print(" ");
                    area --;
                }
                if (h == 0 & x != 0) {
                    System.out.print("|");
                }
                if (h == 0 & x == 0) {
                    System.out.print("+");
                }
                area++;
                if (h > 0 & x != 0) {
                    System.out.print(FILL_CHARACTER);
                }
                if (h > 0 & x == 0) {
                    System.out.print("-");
                }
            }
            System.out.print(PLOT_CHARACTER);
            if (x == 0) {
                for (int i = 0; i < highest_y_value - y; i++) {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        System.out.println("The area under the plot is " + area);
        System.out.println();
    }

    private static void plotNegXSquaredPlus25(int minX, int maxX) {
        System.out.println("y = -(x^2)+25, where " + minX + "<=x<=" + maxX);
        int area = 0;
        int highest_y_value = 0;
        for (int x = minX; x <= maxX; x++) {
            int y = -(x*x)+25;
            if (y >= highest_y_value) {
                highest_y_value = y;
            }
            for (int h = -2; h < y; h++) {
                if (h < 0 & x == 0) {
                    System.out.print("-");
                    area --;
                }
                if (h < 0 & x != 0) {
                    System.out.print(" ");
                    area --;
                }
                if (h == 0 & x != 0) {
                    System.out.print("|");
                }
                if (h == 0 & x == 0) {
                    System.out.print("+");
                }
                area++;
                if (h > 0 & x != 0) {
                    System.out.print(FILL_CHARACTER);
                }
                if (h > 0 & x == 0) {
                    System.out.print("-");
                }
            }
            System.out.print(PLOT_CHARACTER);
            if (x == 0) {
                for (int i = 0; i < highest_y_value - y; i++) {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        System.out.println("The area under the plot is " + area);
        System.out.println();
    }

    private static void plotSinWave(int minX, int maxX) {
        System.out.println("y = 20sin(.5x)+20, where " + minX + "<=x<=" + maxX);
        int area = 0;
        int highest_y_value = 0;
        for (int x = minX; x <= maxX; x++) {
            int y = (int) (20*Math.sin(.5 * x) + 20);
            if (y >= highest_y_value) {
                highest_y_value = y;
            }
            for (int h = -2; h < y; h++) {
                if (h < 0 & x == 0) {
                    System.out.print("-");
                    area --;
                }
                if (h < 0 & x != 0) {
                    System.out.print(" ");
                    area --;
                }
                if (h == 0 & x != 0) {
                    System.out.print("|");
                }
                if (h == 0 & x == 0) {
                    System.out.print("+");
                }
                area++;
                if (h > 0 & x != 0) {
                    System.out.print(FILL_CHARACTER);
                }
                if (h > 0 & x == 0) {
                    System.out.print("-");
                }
            }
            System.out.print(PLOT_CHARACTER);
            if (x == 0) {
                for (int i = 0; i < highest_y_value - y; i++) {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        System.out.println("The area under the plot is " + area);
        System.out.println();
    }
}

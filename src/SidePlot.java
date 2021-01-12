/*
Bjorn Rian
CSC 142
1/11/21

Assignment:
The program performs the console-based plotting of graphs in all four quadrants.
The result is sideways. There are four different functions with different math functions,
which create four different looking graphs in the console. For each function, the math
equation and the domain is stated. Then the graph is displayed, followed by a sentencing
stating the area under the plot.
*/

public class SidePlot {

    //These two final characters are declared in the sideplot class, and then they are used
    //in all four functions.
    public static final char PLOT_CHARACTER = 'x';
    public static final char FILL_CHARACTER = (char)183;

    //In the main function, all four functions are called with their specified domains as
    //parameters.
    public static void main(String[] Args) {
        System.out.println("Sideways Plot:");
        plotXSquaredPlus2(-5, 5);
        plotAbsXTimes3(-6, 6);
        plotNegXSquaredPlus25(-5, 5);
        plotSinWave(-11, 11);
    }

    //All four of the functions are written the same, except for the first print statement
    //and the math function. Therefore, only the first function will be commented on. Here,
    //the function x^2+2 will be converted into points and lines in the console.
    private static void plotXSquaredPlus2(int minX, int maxX) {
        System.out.println("y = x^2+2 where, " + minX + "<=x<=" + maxX);
        int area = 0;
        //This int, highest_y_value, is required to create the y-axis. The y value for x = 0
        //is subtracted from this int, and that value is used to determine how many lines
        //come after the plot character in line containing x = 0.
        int highest_y_value = 0;
        //This for loop will repeat once for every x in the domain specified, so that there
        //is a line for every x value and y value.
        for (int x = minX; x <= maxX; x++) {
            int y = x*x+2;
            if (y >= highest_y_value) {
                highest_y_value = y;
            }
            //This for loop is made to repeat for every line to create the dots or the plot
            //character.
            for (int h = -2; h < y; h++) {
                area ++;
                //All of these if statements are extremely repetitive and unnecessary, but at
                //the moment this is the best solution I can think of for this project. Hope-
                //fully this week's lessons will help me code java and make java programs more
                // efficient.
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
            //An "x" is printed after the dots are finished.
            System.out.print(PLOT_CHARACTER);
            //This is to create the y-axis.
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

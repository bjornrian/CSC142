package NormalDistribution;

import java.awt.Graphics;
import java.awt.Color;

/**
 * This class contains the 2 out of 4 functions that are called in the userInteraction class.
 * Both of these functions produce graphs with normal distribution curves.
 */
public class DrawCurve {

    /**
     * This function draws a normal distribution curve on a 500 * 700 canvas. The mean is 350 and the
     * standard deviation is 100.
     */
    public static void drawStandardCurve() {
        NormalDistribution.DrawingPanel panel2 = new NormalDistribution.DrawingPanel(700, 500);
        Graphics graphics = panel2.getGraphics();
        graphics.setColor(Color.red);

        //125000 value comes from 500/0.004 (Height/Highest y-value)
        for (int x = 0; x <= 700; x++) {
            double y = calculateNormalDistributionGraph(x);
            graphics.drawLine(x, (int) y, x + 1, (int) y + 1);
        }
    }

    /**
     * This function draws a normal distribution curve, and in addition displays a shaded area based on how many
     * standard deviations are input by the user.
     *
     * @param numStdDev
     */
    public static void drawShadedCurve(int numStdDev) {
        NormalDistribution.DrawingPanel panel2 = new NormalDistribution.DrawingPanel(700, 500);
        Graphics graphics = panel2.getGraphics();
        graphics.setColor(Color.red);
        for (int x = 0; x <= 700; x++) {
            double y = calculateNormalDistributionGraph(x);
            graphics.drawLine(x, (int) y, x, (int) y + 2);
        }
        graphics.setColor(Color.yellow);
        for (int x = 350 - numStdDev * 100; x <= 350 + numStdDev * 100; x++) {
            double y = calculateNormalDistributionGraph(x);
            graphics.drawLine(x, (int) y + 2, x, 500);
        }
    }

    /**
     * Equation for normal distribution that is altered to fit on the 500 * 700 canvas.
     *
     * @param x
     * @return
     */
    private static double calculateNormalDistributionGraph(int x) {
        return -(1 / (100 * (Math.sqrt(2 * Math.PI))) * Math.pow(Math.E, -(Math.pow((x - 350), 2)) / 20000) * 125000 - 500);
    }
}

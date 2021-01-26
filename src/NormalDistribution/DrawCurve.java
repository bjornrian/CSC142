package NormalDistribution;

import java.awt.Graphics;
import java.awt.Color;

public class DrawCurve {
    public static void drawStandardCurve() {
        NormalDistribution.DrawingPanel panel2 = new NormalDistribution.DrawingPanel(700, 500);
        Graphics graphics = panel2.getGraphics();
        graphics.setColor(Color.red);

        //125000 value comes from 500/0.004 (Height/Highest y-value)
        for (int x = 0; x <= 700; x++) {
            double y = -(1/(100 * (Math.sqrt(2 * Math.PI))) * Math.pow(Math.E, -(Math.pow((x - 350), 2)) / 20000) * 125000 - 500);
            graphics.drawLine(x, (int) y, x+1,(int) y+1);
        }
    }
    public static void drawShadedCurve(int numStdDev) {
        NormalDistribution.DrawingPanel panel2 = new NormalDistribution.DrawingPanel(700, 500);
        Graphics graphics = panel2.getGraphics();
        graphics.setColor(Color.red);
        for (int x = 0; x <= 700; x++) {
            double y = -(1/(100 * (Math.sqrt(2 * Math.PI))) * Math.pow(Math.E, -(Math.pow((x - 350), 2)) / 20000) * 125000 - 500);
            graphics.drawLine(x, (int) y, x,(int) y+2);
        }
        graphics.setColor(Color.yellow);
        for (int x = 350 - numStdDev * 100; x <= 350 + numStdDev * 100; x++) {
            double y = -(1/(100 * (Math.sqrt(2 * Math.PI))) * Math.pow(Math.E, -(Math.pow((x - 350), 2)) / 20000) * 125000 - 500);
            graphics.drawLine(x, (int) y+2, x, 500);
        }
    }
}

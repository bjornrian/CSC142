package NormalDistribution;
import NormalDistribution.DrawingPanel;

import java.awt.Graphics;
import java.awt.Color;

public class DrawCurve {
    public static void drawStandardCurve() {
        NormalDistribution.DrawingPanel panel2 = new NormalDistribution.DrawingPanel(700, 500);
        Graphics graphics = panel2.getGraphics();
        graphics.setColor(Color.red);
        for (int x = 0; x <= 700; x++) {
            int y = (int) Math.round(-(1/(100 * (Math.sqrt(2 * Math.PI))) * Math.pow(Math.E, - (Math.pow((x - 350), 2)) / 20000)) * 120000 + 500);
            graphics.drawLine(x, y, x+1, y+1);
        }
    }
}

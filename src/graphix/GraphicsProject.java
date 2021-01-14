package graphix;
import java.awt.*;

public class GraphicsProject {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(1000, 1000);
        Graphics graphics = panel.getGraphics();
        graphics.setColor(Color.GREEN);

        int x1 = 100;
        int y1 = 0;
        int x2 = 0;
        int y2 = 1000;
        for (int i = 0; i < 1000; i += 100) {
            graphics.drawLine(x1 + i, y1, x2, y2 - i);
        }
    }
}

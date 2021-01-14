package graphix;
import java.awt.*;

public class GraphicsProject {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(600, 600);
        Graphics graphics = panel.getGraphics();
        graphics.setColor(Color.BLUE);

        int x1 = 330;
        int y1 = 300;
        int x2 = 300;
        int y2 = 600;
        for (int i = 0; i < 300; i += 30) {
            graphics.drawLine(x1 + i, y1, x2, y2 - i);
            graphics.drawLine(x1 - 60 - i, 300, 300, y2 - i);
            graphics.drawLine(x1 - 60 - i, 300, 300, i);
            graphics.drawLine(x1 + i, 300, 300, i);
        }
    }
}

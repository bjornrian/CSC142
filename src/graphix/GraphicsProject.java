package graphix;
import java.awt.Graphics;
import java.awt.Color;

public class GraphicsProject {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(600, 600);
        Graphics graphics = panel.getGraphics();
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, 600, 600);

        int x1 = 0;
        int y1 = 600;
        int x2 = 300;
        int y2 = 300;
        int red_up = 20;
        int blue_down = 224;
        int red_down = 82;
        int blue_up = 38;

        for (int i = 0; i < 310; i += 10) {
            red_up += 2.06;
            blue_down -= 1.2;
            red_down -= 2;
            //blue_up += 1.2;

            graphics.setColor(new Color(red_up, 255, blue_down)); //light blue to lime
            graphics.drawLine(x1 + i, y1 - i, x2 + i, y2 + i);

            graphics.setColor(new Color(red_up, 255, blue_down)); //light blue to lime
            graphics.drawLine(x1 + i, i, x2 - i, y2 + i);

            graphics.setColor(new Color(red_down, 255, blue_up)); //lime to light blue
            graphics.drawLine(x1 + i, i, x2 + i, y2 - i);

            graphics.setColor(new Color(red_down, 255, blue_up)); //lime to light blue
            graphics.drawLine(600 - i, 600 - i, x2 + i, y2 - i);


        /*
        int x1 = 300;
        int y1 = 300;
        int x2 = 300;
        int y2 = 600;
        for (int i = 0; i < 310; i += 10) {
            graphics.drawLine(x1 + i, y1, x2, y2 - i);
            graphics.drawLine(x1 - 10 - i, 300, 300, y2 - i);
            graphics.drawLine(x1 - 10 - i, 300, 300, i);
            graphics.drawLine(x1 + i, 300, 300, i);
         */
        }
    }
}

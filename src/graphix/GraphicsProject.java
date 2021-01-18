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
        int red = 0;
        int green = 0;
        int blue = 0;

        for (int i = 0; i < 310; i += 10) {
            red += 7;
            green += 7;
            blue += 7;

            graphics.setColor(new Color(red, green, blue)); //light blue to lime
            graphics.drawLine(x1 + i, y1 - i, x2 + i, y2 + i);

            graphics.setColor(new Color(red, green, blue)); //light blue to lime
            graphics.drawLine(x1 + i, i, x2 - i, y2 + i);

            graphics.setColor(new Color(red, green, blue)); //lime to light blue
            graphics.drawLine(600 - i, i, x2 - i, y2 - i);

            graphics.setColor(new Color(red, green, blue)); //lime to light blue
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

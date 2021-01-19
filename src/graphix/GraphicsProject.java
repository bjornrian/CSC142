/*
Bjorn Rian
1/18/21
CSC142

Assignment #1: GraphicsProject.java creates a cool shape in the java drawing panel,
which uses the methods of DrawingPanel. The authors of the DrawingPanel class are
Marty Stepp and Stuart Reges.

Assignment #2: This class creates a canvas that shows an exquisite piece of art.
A piece of art hidden from all of mankind until now. This art piece is called
"Ball on Stairs".
 */

package graphix;
import java.awt.Graphics;
import java.awt.Color;

public class GraphicsProject {
    public static void main(String[] args) {
        vortex();
        stairs();
    }

    private static void vortex() {
        //Creates a canvas that is 600*600 pixels
        DrawingPanel panel2 = new DrawingPanel(600, 600);
        Graphics graphics = panel2.getGraphics();
        //Sets background of the canvas to black
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, 600, 600);

        //These are the the variables that are repeatedly used as parameters in
        // graphics.drawLine
        int y1 = 600;
        int x2 = 300;
        int y2 = 300;
        //These variables are created so that they can be used as incrementing
        // variables in graphics.setColor
        int red = 0;
        int green = 0;
        int blue = 0;

        //This for loop runs 30 times, which means that it creates 120 lines
        // that have 30 different colors ranging from white, grey, and black
        for (int i = 0; i <= 300; i += 10) {
            //This increments the rgb variable placeholders so that they increase
            // to about 255 but not over 255
            red += 7;
            green += 7;
            blue += 7;

            //Fourth quadrant
            graphics.setColor(new Color(red, green, blue)); //light blue to lime
            graphics.drawLine(i, y1 - i, x2 + i, y2 + i);

            //Third quadrant
            graphics.setColor(new Color(red, green, blue)); //light blue to lime
            graphics.drawLine(i, i, x2 - i, y2 + i);

            //Second quadrant
            graphics.setColor(new Color(red, green, blue)); //lime to light blue
            graphics.drawLine(600 - i, i, x2 - i, y2 - i);

            //First quadrant
            graphics.setColor(new Color(red, green, blue)); //lime to light blue
            graphics.drawLine(600 - i, 600 - i, x2 + i, y2 - i);
        }
    }

    private static void stairs() {
        //Initiate canvas
        DrawingPanel panel = new DrawingPanel(800, 800);
        Graphics graphics = panel.getGraphics();

        //Tracing of balls path of travel
        graphics.drawArc(645, 75, 150, 150, 42, 180);
        graphics.drawArc(535, 175, 150, 150, 42, 180);
        graphics.drawArc(425, 275, 150, 150, 42, 180);
        graphics.drawArc(297, 355, 150, 150, 22, 63);

        //For loop for stairs
        for (int i = 0; i <= 800; i += 100) {
            graphics.drawRect(i, 800 - i, 100, i);
        }
        //Red ball
        graphics.setColor(Color.red);
        graphics.fillOval(300, 300, 80, 80);

        //Sclera
        graphics.setColor(Color.white);
        graphics.fillOval(317, 323, 20, 20);
        graphics.fillOval(344, 323, 20, 20);

        //Pupils
        graphics.setColor(Color.black);
        graphics.fillOval(327, 330, 10, 10);
        graphics.fillOval(345, 330, 10, 10);
    }
}

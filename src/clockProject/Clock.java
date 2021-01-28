package clockProject;

import java.awt.*;

public class Clock {
    public Clock(int hour, int minute) {
        int PANEL_SIDE_LENGTH = 800;
        clockProject.DrawingPanel panel2 = new clockProject.DrawingPanel(PANEL_SIDE_LENGTH, PANEL_SIDE_LENGTH);
        Graphics graphics = panel2.getGraphics();
        graphics.setFont(new Font("TimesRoman", Font.BOLD, 120));

        graphics.drawOval(50, 50, 700, 700);

        graphics.drawString("12", 335, 150);
        graphics.drawString("1", 450, 150);
        graphics.drawString("2", 500, 200);
        graphics.drawString("3", 550, 250);
        graphics.drawString("4", 500, 300);
        graphics.drawString("5", 450, 650);
        graphics.drawString("6", 400, 700);
        /*graphics.drawString("7");
        graphics.drawString("8");
        graphics.drawString("9");
        graphics.drawString("10");
        graphics.drawString("11");
        */
    }
}

package clockProject;

import java.awt.*;

public class Clock {

    private int hour;
    private int minute;
    int PANEL_SIDE_LENGTH = 800;
    clockProject.DrawingPanel panel2 = new clockProject.DrawingPanel(PANEL_SIDE_LENGTH, PANEL_SIDE_LENGTH);
    Graphics graphics = panel2.getGraphics();

    public Clock(int hour, int minute) {
        graphics.setFont(new Font("TimesRoman", Font.BOLD, 120));

        //Method drawCircleStructure
        graphics.drawOval(50, 50, 700, 700);

        graphics.drawString("12", 335, 150);
        graphics.drawString("1", 510, 190);
        graphics.drawString("2", 620, 280);
        graphics.drawString("3", 680, 430);
        graphics.drawString("4", 620, 600);
        graphics.drawString("5", 510, 700);
        graphics.drawString("6", 370, 740);
        graphics.drawString("7", 235, 705);
        graphics.drawString("8", 120, 610);
        graphics.drawString("9", 70, 440);
        graphics.drawString("10", 95, 290);
        graphics.drawString("11", 195, 190);

        minuteHand(minute);
        hourHand(hour);
    }

    private void minuteHand(int minute) {
        int minuteToRadian = 0;
        if (minute % 5 >= 3) {
            minuteToRadian = minute / 5 + 1;
        } else if (minute % 5 <= 2) {
            minuteToRadian = minute / 5;
        }
        int n = -3 + minuteToRadian;
        int m = 6;
        int x = (int) (350 * Math.cos(n*Math.PI/m) + 400);
        int y = (int) (350 * Math.sin(n*Math.PI/m) + 400);
        graphics.drawLine(400, 400, x, y);
    }

    private void hourHand(int hour) {
        int hourToRadian = hour;
        if (minute > 58) {
            hourToRadian += 1;
        }
        int n = -3 + hourToRadian;
        int m = 6;
        int x = (int) (350 * Math.cos(n*Math.PI/m) + 400);
        int y = (int) (350 * Math.sin(n*Math.PI/m) + 400);
        graphics.drawLine(400, 400, x, y);
    }
}
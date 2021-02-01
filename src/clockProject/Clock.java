package clockProject;

import java.awt.Graphics2D;
import java.awt.*;

public class Clock {

    private Time time;
    private Integer setTimeCount = 0;
    private final int PANEL_SIDE_LENGTH = 800;
    clockProject.DrawingPanel panel;
    Graphics graphics;

    public Clock() {
        time = new Time();
        panel = new clockProject.DrawingPanel(PANEL_SIDE_LENGTH, PANEL_SIDE_LENGTH);
        graphics = panel.getGraphics();
        drawCircleStructure();
        redraw();
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        setTimeCount += 1;
        this.time = time;
    }

    public Integer getSetTimeCount() {
        return setTimeCount;
    }

    //this method does only hour validation and nothing else. rename or rewrite
    //should return Double
    public static double timeToHourRadians(int hour) {
        if (hour < 0 || hour > 12) {
            throw new IllegalArgumentException("Hour value needs to be an integer between 0-12");
        }
        return hour;
    }

    public static double timeToMinuteRadians(int minute) {
        if (minute < 0 || minute > 60) {
            throw new IllegalArgumentException("Minute value needs to be an integer between 0-60");
        }
        int minuteToRadian;
        if (minute % 12 >= 7) {
            minuteToRadian = minute / 12 + 1;
        } else {
            minuteToRadian = minute / 12;
        }
        return minuteToRadian;
    }

    public void redraw() {
        drawMinuteHand(time.getMinute());
        drawHourHand(time.getHour(), time.getMinute());
    }

    private void drawCircleStructure() {
        setTimeCount += 1;
        graphics.setFont(new Font("TimesRoman", Font.BOLD, 120));

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
    }

    private void drawMinuteHand(int minute) {
        int minuteToRadian = 0;
        if (minute % 5 >= 3) {
            minuteToRadian = minute / 5 + 1;
        } else if (minute % 5 <= 2) {
            minuteToRadian = minute / 5;
        }
        int n = -3 + minuteToRadian;
        int m = 6;
        int x = (int) (270 * Math.cos(n * Math.PI / m) + 400);
        int y = (int) (270 * Math.sin(n * Math.PI / m) + 400);
        ((Graphics2D) graphics).setStroke(new BasicStroke(5));
        graphics.drawLine(400, 400, x, y);
    }

    private void drawHourHand(int hour, int minute) {
        int n = -15 + 5 * hour + minute / 12; //For every twelve minutes, pi/30 is added
        int m = 30;
        int x = (int) (160 * Math.cos(n * Math.PI / m) + 400);
        int y = (int) (160 * Math.sin(n * Math.PI / m) + 400);
        ((Graphics2D) graphics).setStroke(new BasicStroke(10));
        graphics.drawLine(400, 400, x, y);
    }
}
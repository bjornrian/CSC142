package clockProject;

import java.awt.Graphics2D;
import java.awt.*;

/**
 * The Clock class creates Clock objects that draw a default clock showing 12:00,
 * or different times based on the Time object.
 *
 * @author  Bjorn Rian
 * @version 2/2/21
 */
public class Clock {

    private Time time;
    private Integer setTimeCount = 0;
    clockProject.DrawingPanel panel;
    Graphics graphics;

    /**
     * Creates a clock with a default Time object (defaulted to 12:00 AM).
     * Creates the graphics needed to draw the clock.
     */
    public Clock() {
        time = new Time(); //Default Time object
        int PANEL_SIDE_LENGTH = 800;
        panel = new clockProject.DrawingPanel(PANEL_SIDE_LENGTH, PANEL_SIDE_LENGTH);
        graphics = panel.getGraphics();
        drawClockStructure();
        this.redraw();
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        setTimeCount += 1;
        this.time = time;
        this.redraw();
    }

    /**
     * @return the amount of times that a time is set for the clock object,
     * including the first time that the clock is set.
     */
    public Integer getSetTimeCount() {
        return setTimeCount;
    }

    /**
     * Hours are converted into the appropriate amount of radians in a circle.
     *
     * @return a radian value that is hour * PI/6 (hour/12th's of a circle)
     */
    public static double timeToHourRadians(int hour) {
        if (hour < 0 || hour > 12) {
            throw new IllegalArgumentException("Hour value needs to be an integer between 0-12");
        }
        return hour * (Math.PI/6);
    }

    /**
     * Minutes are converted into the appropriate amount of radians in a circle.
     *
     * @return Returns a radian value that is minuteToRadian * 2PI/60 (minuteToRadian/60th's of a circle)
     */
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
        return minuteToRadian * (Math.PI/30);
    }

    /**
     * A white circle is drawn over the previous minute and hour hands,
     * and a new set of hands is printed on top.
     */
    private void redraw() {
        ((Graphics2D) graphics).setStroke(new BasicStroke(1));
        graphics.setColor(Color.white);
        graphics.fillOval(145, 145, 500, 500);
        ((Graphics2D) graphics).setStroke(new BasicStroke(5));
        graphics.setColor(Color.black);
        drawMinuteHand(time.getMinute());
        drawHourHand(time.getHour(), time.getMinute());
    }

    private void drawClockStructure() {
        setTimeCount += 1;
        graphics.setFont(new Font("TimesRoman", Font.BOLD, 80));

        graphics.drawOval(50, 50, 700, 700);

        graphics.drawString("12", 350, 120);
        graphics.drawString("1", 540, 160);
        graphics.drawString("2", 650, 270);
        graphics.drawString("3", 700, 430);
        graphics.drawString("4", 650, 590);
        graphics.drawString("5", 530, 705);
        graphics.drawString("6", 380, 740);
        graphics.drawString("7", 235, 705);
        graphics.drawString("8", 120, 610);
        graphics.drawString("9", 60, 440);
        graphics.drawString("10", 85, 280);
        graphics.drawString("11", 180, 175);
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
        int x = (int) (245 * Math.cos(n * Math.PI / m) + 400);
        int y = (int) (245 * Math.sin(n * Math.PI / m) + 400);
        ((Graphics2D) graphics).setStroke(new BasicStroke(5));
        graphics.drawLine(400, 400, x, y);
    }

    private void drawHourHand(int hour, int minute) {
        int n = -15 + 5 * hour + minute / 12; //For every twelve minutes, pi/30 is added to angle
        int m = 30;
        int x = (int) (160 * Math.cos(n * Math.PI / m) + 400);
        int y = (int) (160 * Math.sin(n * Math.PI / m) + 400);
        ((Graphics2D) graphics).setStroke(new BasicStroke(10));
        graphics.drawLine(400, 400, x, y);
    }
}
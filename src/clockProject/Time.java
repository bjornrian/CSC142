package clockProject;

import java.text.DecimalFormat;

public class Time {
    public enum DayPortion {
        AM, PM
    }

    String pattern = "##";
    DecimalFormat decimalFormat = new DecimalFormat(pattern);

    private int hour;
    private int minute;
    private DayPortion dayPortion;

    public Time(int hour, int minute, DayPortion dayPortion) {
        this.hour = hour;
        this.minute = Integer.parseInt(decimalFormat.format(minute));
        this.dayPortion = dayPortion;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public DayPortion getDayPortion() {
        return dayPortion;
    }

    public void setHour(int hour) {
        if (hour > 12 || hour < 0) {
            throw new IllegalArgumentException("Hour value cannot be more than 12 or less than 0");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute > 59 || minute < 0) {
            throw new IllegalArgumentException("Hour value cannot be more than 12 or less than 0");
        }
        this.minute = minute;
    }

    public void setDayPortion(DayPortion dayPortion) {
        this.dayPortion = dayPortion;
    }

    public String toString() {
        return (hour + ":" + minute + dayPortion);
    }
}

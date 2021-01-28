package clockProject;

public class Time {
    public enum DayPortion {
        AM, PM
    }

    private int hour;
    private String minute;
    private DayPortion dayPortion;

    public Time(int hour, int minute, DayPortion dayPortion) {
        this.hour = hour;
        this.minute = String.valueOf(minute);
        this.dayPortion = dayPortion;
    }

    public int getHour() {
        return hour;
    }

    public String getMinute() {
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
        if (minute < 10) {
            minute = Integer.valueOf(("0" + minute));
        }
        this.minute = String.valueOf(minute);

    }

    public void setDayPortion(DayPortion dayPortion) {
        this.dayPortion = dayPortion;
    }

    public String toString() {
        return (hour + ":" + minute + dayPortion);
    }
}

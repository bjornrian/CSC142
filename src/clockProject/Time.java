package clockProject;

public class Time {
    public enum DayPortion {
        AM, PM
    }

    private int hour;
    private String minute;
    private DayPortion dayPortion;

    public Time(int hour, int minute, DayPortion dayPortion) {
        if (hour > 12 || hour <= 0) {
            throw new IllegalArgumentException("Hour value cannot be more than 12 or less than 0");
        }
        this.hour = hour;

        String minuteString = String.valueOf(minute);
        if (minute > 59 || minute < 0) {
            throw new IllegalArgumentException("Minute value cannot be more than 59 or less than 0");
        }
        if (minute < 10) {
            minuteString = "0" + String.valueOf(minute);
        }
        this.minute = minuteString;

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
        if (hour > 12 || hour <= 0) {
            throw new IllegalArgumentException("Hour value cannot be more than 12 or less than 0");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        String minuteString = String.valueOf(minute);
        if (minute > 59 || minute < 0) {
            throw new IllegalArgumentException("Minute value cannot be more than 59 or less than 0");
        }
        if (minute < 10) {
            minuteString = "0" + minute;
        }
        this.minute = String.valueOf(minuteString);

    }

    public void setDayPortion(DayPortion dayPortion) {
        this.dayPortion = dayPortion;
    }

    public String toString() {
        return (hour + ":" + minute + dayPortion);
    }


}



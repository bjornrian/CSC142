package clockProject;

public class Time {
    public enum DayPortion {
        AM, PM
    }

    private int hour;//needs to be Integer
    private int minute;//needs to be Integer
    private DayPortion dayPortion;

    public Time(int hour, int minute, DayPortion dayPortion) {
        validateHour(hour);
        this.hour = hour;

        validateMinute(minute);
        this.minute = minute;

        this.dayPortion = dayPortion;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public DayPortion getDayPortion() {
        return this.dayPortion;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public void setDayPortion(DayPortion dayPortion) {
        this.dayPortion = dayPortion;
    }

    public String toString() {
        if (minute >= 0 && minute <= 9) {
            return (hour + ":0" + minute + dayPortion);
        } else {
            return (hour + ":" + minute + dayPortion);
        }
    }

    private void validateHour(int hour) {
        if (hour > 12 || hour <= 0) {
            throw new IllegalArgumentException("Hour value cannot be more than 12 or less than 0");
        }
    }

    private void validateMinute(int minute) {
        if (minute > 59 || minute < 0) {
            throw new IllegalArgumentException("Minute value cannot be more than 59 or less than 0");
        }
    }
}



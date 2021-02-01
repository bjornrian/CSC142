package clockProject;

public class Time {
    public enum DayPortion {
        AM, PM
    }

    private Integer hour = 12;
    private Integer minute = 0;
    private DayPortion dayPortion = DayPortion.AM;

    public Time() {
    }

    public Time(Integer hour, Integer minute, DayPortion dayPortion) {
        this.setHour(hour);
        this.setMinute(minute);
        this.dayPortion = dayPortion;
    }

    public Integer getHour() {
        return this.hour;
    }

    public Integer getMinute() {
        return this.minute;
    }

    public DayPortion getDayPortion() {
        return this.dayPortion;
    }

    public void setHour(Integer hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public void setMinute(Integer minute) {
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

    public void validateHour(Integer hour) {
        if (hour > 12 || hour <= 0) {
            throw new IllegalArgumentException("Hour value cannot be more than 12 or less than 0");
        }
    }

    public void validateMinute(Integer minute) {
        if (minute > 59 || minute < 0) {
            throw new IllegalArgumentException("Minute value cannot be more than 59 or less than 0");
        }
    }
}



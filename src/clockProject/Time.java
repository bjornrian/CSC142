package clockProject;

public class Time {
    public enum DayPortion {
        AM,
        PM
    }

    private int hour;
    private int minute;
    private DayPortion dayPortion;

    public Time(int hour, int minute, DayPortion dayPortion) {
        this.hour = hour;
        this.minute = minute;
        this.dayPortion = dayPortion;
    }

    public int getHour() {
        return 0;
    }

    public int getMinute() {
        return 0;
    }

    public DayPortion getDayPortion() {
        return dayPortion;
    }

    public int setHour() {
        return 0;
    }

    public int setMinute() {
        return 0;
    }

    public DayPortion setDayPortion() {
        return dayPortion;
    }
}

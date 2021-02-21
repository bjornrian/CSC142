package weather;

/**
 * While there are certainly more date capabilities built into Java,
 * we will not use them here.
 * To practice with  objects, we  will create  our  own  Date  object
 * that  consists  of  a  year,  a  month,  and  a  day.
 * We  will provide simple, standard set/get methods for these.
 */
public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean equals(Date date) {
        return this.year == date.getYear() &&
                this.month == date.getMonth() &&
                this.day == date.getDay();
    }
}

package weather;

/**
 * While there are certainly more date capabilities built into Java,
 * we will not use them here.
 * To practice with  objects, we  will create  our  own  Date  object
 * that  consists  of  a  year,  a  month,  and  a  day.
 * We  will provide simple, standard set/get methods for these.
 *
 * Throw an IllegalArgumentException if the year is negative,
 * month is outside the range 1...12, or day is outside the range 1...31.
 * You are not responsible for leap year checks or month-length checks
 * unless you want to do the extra work. In the toString method,
 * render the date in the typical US format:  MM/DD/YY
 */
public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        validateInput(year, month, day);
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

    /**
     * @return date in the typical US format:  MM/DD/YY
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append((month < 10 ? "0" : "") + String.valueOf(month))
                .append("/")
                .append((day < 10 ? "0" : "") + String.valueOf(day))
                .append("/")
                .append(String.valueOf(year).substring(2));
        return builder.toString();
    }

    public boolean equals(Date date) {
        return this.year == date.getYear() &&
                this.month == date.getMonth() &&
                this.day == date.getDay();
    }

    private void validateInput(int year, int month, int day) {
        if(year < 1 || month < 1 || month > 12 || day < 1 || day > 31) {
            throw new IllegalArgumentException("Invalid date");
        }
    }
}

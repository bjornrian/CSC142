package weather;

/**
 * This object makes it convenient to package up two dates;
 * this is useful in describing date ranges.
 */
public class DateRange {
    private Date start;
    private Date end;

    public DateRange(Date start, Date end) {
        validateInput(start, end);
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return this.start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return this.end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    /**
     * In the toString method, show the start and end of the date range.
     * Do not duplicate code from the Date toString method; leverage it instead.
     *
     * @return start and end of the date range
     */
    public String toString() {
        return "Start:" + this.start + "\n" +
                "End:" + this.end;
    }

    /**
     * Throw an IllegalArgumentException if either Date reference is null.
     *
     * @param beginDate
     * @param endDate
     */
    private void validateInput(Date beginDate, Date endDate) {
        if (beginDate == null) {
            throw new IllegalArgumentException("The beginning date cannot equal null");
        }
        if (endDate == null) {
            throw new IllegalArgumentException("The ending date cannot equal null");
        }
    }
}

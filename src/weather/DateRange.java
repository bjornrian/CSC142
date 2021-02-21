package weather;

/**
 * This object makes it convenient to package up two dates;
 * this is useful in describing date ranges.
 */
public class DateRange {
    private Date beginDate;
    private Date endDate;

    public DateRange(Date beginDate, Date endDate) {
        validateInput(beginDate, endDate);
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * In the toString method, show the start and end of the date range.
     * Do not duplicate code from the Date toString method; leverage it instead.
     *
     * @return start and end of the date range
     */
    public String toString() {
        //todo
        return "";
    }

    /**
     * Throw an IllegalArgumentException if either Date reference is null.
     *
     * @param beginDate
     * @param endDate
     */
    private void validateInput(Date beginDate, Date endDate) {
        //todo
    }
}

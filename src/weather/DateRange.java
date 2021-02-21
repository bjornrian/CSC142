package weather;

/**
 * This object makes it convenient to package up two dates;
 * this is useful in describing date ranges.
 */
public class DateRange {
    private Date beginDate;
    private Date endDate;

    public DateRange(Date beginDate, Date endDate) {
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
}

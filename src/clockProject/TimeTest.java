package clockProject;

import static org.junit.Assert.*;
import org.junit.Test;

public class TimeTest {
    @Test
    public void testTime() {
        assertEquals("12:11PM", new Time(12, 11, Time.DayPortion.PM).toString());
        assertEquals("12:59PM", new Time(12, 59, Time.DayPortion.PM).toString());
        assertEquals("1:23AM", new Time(1, 23, Time.DayPortion.AM).toString());
        assertEquals("4:39PM", new Time(4, 39, Time.DayPortion.PM).toString());
        assertEquals("4:20AM", new Time(4, 20, Time.DayPortion.AM).toString());
    }
}

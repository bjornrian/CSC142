package clockProject;

import static org.junit.Assert.*;
import org.junit.Test;

public class TimeTest {
    @Test
    public void testTime() {
        assertEquals("12:11PM", new Time(12, 11, Time.DayPortion.PM));
    }
}

package weather;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidYear() {
        Date date = new Date(-1, 1, 24);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidMonth() {
        Date date = new Date(1973, 13, 24);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidDay() {
        Date date = new Date(1973, 1, 33);
    }

    @Test
    public void testToString() {
        Date date1 = new Date(1973, 1, 24);
        assertEquals("01/24/73", date1.toString());

        Date date2 = new Date(2021, 12, 24);
        assertEquals("12/24/21", date2.toString());

        Date date3 = new Date(1921, 12, 9);
        assertEquals("12/09/21", date3.toString());
    }

    @Test
    public void testEquals() {
        Date date1 = new Date(1973, 1, 24);
        Date date2 = new Date(1973, 1, 24);
        assertTrue(date1.equals(date2));

        Date date3 = new Date(1975, 2, 31);
        assertFalse(date1.equals(date3));
    }
}
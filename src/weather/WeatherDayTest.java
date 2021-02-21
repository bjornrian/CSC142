package weather;

import org.junit.Test;

import static org.junit.Assert.*;

public class WeatherDayTest {

    private static final double DELTA = 0.500000;

    @Test
    public void testCalcHeatIndexWikipedia() {
        WeatherDay weatherDay = new WeatherDay(90.0, 90.0);
        assertEquals(122, weatherDay.calcHeatIndexWikipedia(), DELTA);
    }

    @Test
    public void testCalcHeatIndexNoaa() {
        WeatherDay weatherDay = new WeatherDay(90.0, 90.0);
        assertEquals(122, weatherDay.calcHeatIndexNoaa(), DELTA);
    }
}
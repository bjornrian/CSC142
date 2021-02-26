package weather;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WeatherManagerTest {
    private static final String WEATHER_FILE = "weather\\SeattleWeather.txt";

    @Test
    public void findLongestTrendTest() throws FileNotFoundException {
        WeatherManager manager = buildWeatherManager();
        DateRange expected = new DateRange(new Date(2018, 12, 4), new Date(2018, 12, 11));
        DateRange actual = manager.getLongestWarmingTrend(2018);
        assertTrue(expected.equals(actual));

        expected = new DateRange(new Date(2019, 2, 9), new Date(2019, 2, 15));
        actual = manager.getLongestWarmingTrend(2019);
        System.out.println(actual);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void testGetWeatherDayCount() throws FileNotFoundException {
        WeatherManager manager = buildWeatherManager();
        assertEquals(424, manager.getWeatherDayCount());
    }

     public WeatherManager buildWeatherManager() throws FileNotFoundException {
        File weatherData = new File(WEATHER_FILE);
        WeatherManager manager = new WeatherManager(weatherData);
        return manager;
    }
}

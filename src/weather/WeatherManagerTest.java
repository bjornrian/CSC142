package weather;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class WeatherManagerTest {
    private static final String WEATHER_FILE = "weather\\SeattleWeather.txt";

    @Test public void testParseFile() throws FileNotFoundException {
        File weatherData;
        weatherData = new File(WEATHER_FILE);
        WeatherManager manager = new WeatherManager(weatherData);
        assertEquals(424, manager.getWeatherDayCount());

    }
}

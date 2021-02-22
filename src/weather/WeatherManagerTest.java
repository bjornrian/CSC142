package weather;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class WeatherManagerTest {
    private static final String WEATHER_FILE = "weather\\SeattleWeather.txt";

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

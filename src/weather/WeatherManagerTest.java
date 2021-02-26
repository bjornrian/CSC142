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
    public void testCalcAvgHighTemp() throws FileNotFoundException {
        WeatherManager manager = buildWeatherManager();
        double actual = manager.calcAvgHighTemp(2018, 3);
        double sum = (51+45+51+47+46+53+50+52+50+58+63+73+64+52+55+57+52+54+53+55+58+49+49+47+51+46+52+53+53+57+58);
        double denominator = 31;
        double expected = sum / denominator;
        assertEquals(expected, actual, 0.000000001);
    }

    @Test
    public void testCalcAvgLowTemp() throws FileNotFoundException {
        WeatherManager manager = buildWeatherManager();
        double actual = manager.calcAvgLowTemp(2019, 2);
        double sum = (45+41+31+25+21+21+25+29+27+21+29+34+32+30+38+36+34+36+38+37+32+35+37+37+32+32+33+30);
        double denominator = 28;
        double expected = sum / denominator;
        assertEquals(expected, actual, 0.000000001);
    }

    @Test
    public void testRainTotal() throws FileNotFoundException {
        WeatherManager manager = buildWeatherManager();
        double actual = manager.calcRainTotal(2018, 3);
        double sum = (0.18+0.11+0.07+0.0+0.13+0.0+0.0+0.04+0.35+0.0+0.0+0.0+0.0+0.27+0.03+0.0+0.0+0.0+0.0+0.0+0.0+0.13+0.43+0.52+0.06+0.05+0.2+0.02+0.0+0.0+0.0);
        assertEquals(sum, actual, 0.00000001);
    }

    @Test
    public void testRainiestMonth() throws FileNotFoundException {
        WeatherManager manager = buildWeatherManager();
        int actual = manager.calcRainiestMonth(2018);
        assertEquals(11, actual);

        actual = manager.calcRainiestMonth(2019);
        assertEquals(2, actual);
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

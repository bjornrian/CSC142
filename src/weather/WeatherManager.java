package weather;
import java.io.File;

/**
 * This object is the main way that client code will interact with the rest
 * of the system.  It will have a variety of useful methods that will let
 * clients glean useful information about weather data and trends.
 * While we could imagine many methods to write, we will keep it to a small
 * number for now.  It will be able to read the data file and retrieve and
 * find a WeatherDay in its array.  It will need to put the array into
 * chronological (ascending  date)order.
 * It  will  also  be  able  to  calculate  the  average  high  temperature
 * for  a  specified month, and the average low temperature for a month.
 * It will also calculate the rain total for a specified month.
 */
public class WeatherManager {
    private static final int NOT_FOUND = -1;
    private WeatherDay[] weatherData;
    private static final String WEATHER_FILE = "SeattleWeather.txt";
    File weatherFile = new File(WEATHER_FILE);

    public WeatherManager(File weatherFile){
        
    }

    public int getWeatherDayCount() {
        return weatherData.length;
    }

    public WeatherDay getWeatherDay(int index) {
       return weatherData[index];
    }

    public int findWeatherDay(Date date) {
        for (int i = 0; i < weatherData.length; i++) {

            WeatherDay day = weatherData[i];
            if (day.getDate().equals(date)) {
                return i;
            }
        }
        return NOT_FOUND;
    }


}

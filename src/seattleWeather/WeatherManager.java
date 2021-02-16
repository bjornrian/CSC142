package seattleWeather;
import java.io.File;

public class WeatherManager {
    private WeatherDay[] weatherData = new WeatherDay[7];

    File weatherFile = new File("SeattleWeather.txt");
    public WeatherManager(File weatherFile){
        
    }
}

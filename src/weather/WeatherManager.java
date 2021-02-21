package weather;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
 * <p>
 * The constructor should create the array and read in the data from the specified file.
 * Use a Scanner to read the text file; see the Hints section for more information.
 * Copy the insertion sort code from class slides and adapt it to sort the weather
 * array into chronological order(i.e., earliest date first). Do not use any Arrays
 * methods to do this. Think carefully about the private member data you choose to
 * store; just because you can compute it does  not mean  you  need  to  store  it.
 * Consider  that  later we might  add,  delete,  or  correct weather data;
 * code so that will not be a problem. Algorithms should not traverse the array more
 * than necessary.  If you locate what you are looking for, you should  not continue
 * to  loop. For  more  complex  algorithms,  you  should  be  able  to  locate  the
 * starting point,  then move  forward only  as far as necessary.  You should not
 * go back  over list  items again, nor create side arrays in the process.
 * Return “signal” data when appropriate, e.g., in findWeatherDay, if there is no
 * such day in the data, a return of -1 would be a good response.
 * Prefer this to throwing exceptions.
 */
public class WeatherManager {
    private static final int NOT_FOUND = -1;
    private static final String WEATHER_FILE = "weather\\SeattleWeather.txt";
    private WeatherDay[] weatherData;

    public static void main(String[] args) throws FileNotFoundException {
        File weatherData = new File(WEATHER_FILE);
        WeatherManager manager = new WeatherManager(weatherData);
    }

    public WeatherManager(File weatherDataFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(weatherDataFile);
        int numberOfRows = scanner.nextInt();
        System.out.println("numberOfRows = " + numberOfRows);
        weatherData = new WeatherDay[numberOfRows];
        scanner.nextLine();
        String headerLine = scanner.nextLine();
        System.out.println("headerLine = " + headerLine);
        while(scanner.hasNextLine()) {
            processWeatherData(scanner.nextLine());
        }
        scanner.close();
    }

    private void processWeatherData(String nextLine) {
        System.out.println("nextLine = " + nextLine);
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

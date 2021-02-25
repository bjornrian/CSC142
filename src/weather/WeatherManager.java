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
    public static final int INDEX_YEAR = 0;
    public static final int INDEX_MONTH = 1;
    public static final int INDEX_DAY = 2;
    public static final int INDEX_TEMP_MAX = 3;
    public static final int INDEX_TEMP_AVG = 4;
    public static final int INDEX_TEMP_MIN = 5;
    public static final int INDEX_HUMIDITY_AVG = 10;
    public static final int INDEX_WIND_AVG = 13;
    public static final int INDEX_PRECIPITATION = 18;

    //the collection of weather data objects, sorted by date
    private WeatherDay[] weatherDays;

    public static void main(String[] args) throws FileNotFoundException {
        File weatherData = new File(WEATHER_FILE);
        WeatherManager manager = new WeatherManager(weatherData);
    }

    public WeatherManager(File weatherDataFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(weatherDataFile);
        //first row tells us how many rows we have
        int numberOfRows = scanner.nextInt();
        //build our empty collection with the correct number of rows
        weatherDays = new WeatherDay[numberOfRows];
        //finish the first line
        scanner.nextLine();
        //second row is our header line. Ignore it.
        String headerLine = scanner.nextLine();
        System.out.println("headerLine = " + headerLine);
        //read the rest of the lines into our collection
        int index = 0;
        //build your collection of weather data - unsorted
        while(scanner.hasNextLine()) {
            processWeatherData(scanner.nextLine(), index++);
        }
        scanner.close();

        //sort our collection
        sortWeatherDateByDate();
//        printWeatherData();
    }

    public int getWeatherDayCount() {
        return weatherDays.length;
    }

    public WeatherDay getWeatherDay(int index) {
        return weatherDays[index];
    }

    public int findWeatherDay(Date date) {
        for (int i = 0; i < weatherDays.length; i++) {

            WeatherDay day = weatherDays[i];
            if (day.getDate().equals(date)) {
                return i;
            }
        }
        return NOT_FOUND;
    }

    public double calcAvgHighTemp(int year, int month) {
        //todo
        double accumulator = 0;
        int divider = 0;
        for (int i = 0; i < weatherDays.length; i++) {
            if (weatherDays[i].getDate().getYear() == year && weatherDays[i].getDate().getMonth() == month) {
                accumulator += weatherDays[i].getTempHigh();
                divider++;
            }
        }
        return accumulator / divider;
    }

    public double calcAvgLowTemp(int year, int month) {
        //todo
        double accumulator = 0;
        int divider = 0;
        for (int i = 0; i < weatherDays.length; i++) {
            if (weatherDays[i].getDate().getYear() == year && weatherDays[i].getDate().getMonth() == month) {
                accumulator += weatherDays[i].getTempLow();
                divider++;
            }
        }
        return accumulator / divider;
    }

    public double calcRainTotal(int year, int month) {
        double accumulator = 0;
        for (int i = 0; i < weatherDays.length; i++) {
            if (weatherDays[i].getDate().getYear() == year && weatherDays[i].getDate().getMonth() == month) {
               accumulator += weatherDays[i].getPrecipitation();
            }
        }
        return accumulator;
    }

    public int calcRainiestMonth(int year) {
        double tempPrecipitation = 0;
        int tempIndex = 0;
        for (int i = 0; i < weatherDays.length; i++) {
            if (weatherDays[i].getDate().getYear() == year) {
                if (weatherDays[i].getPrecipitation() > tempPrecipitation) {
                    tempPrecipitation = weatherDays[i].getPrecipitation();
                    tempIndex = i;
                }
            }
        }
        return tempIndex;
    }

    public DateRange calcLongestWarmingTrend(int year) {

    }

    private void printWeatherData() {
        for(int i = 0; i < weatherDays.length; i++) {
            System.out.println(weatherDays[i].toString());
        }
    }

    /**
     * Insertion sort: adapted to sort WeatherDay objects.
     * Sorted in ascending order based on WeatherDay.date property
     * From https://www.geeksforgeeks.org/insertion-sort/
     */
    private void sortWeatherDateByDate() {
        for(int i = 1; i < weatherDays.length; i++) {
            WeatherDay key = weatherDays[i];
            int j = i - 1;
              /* Move elements of arr[0..i-1], that are
               greater/later than key, to one position ahead
               of their current position */
            while (j >= 0 && weatherDays[j].getDate().compare(key.getDate()) < 0) {
                weatherDays[j + 1] = weatherDays[j];
                j = j - 1;
            }
            weatherDays[j + 1] = key;
        }
    }

    /**
     * Receive a line from a weather data file.
     * Build a WeatherDay object from the line.
     * Insert the object into our collection.
     *
     * @param nextLine
     * @param index
     */
    private void processWeatherData(String nextLine, int index) {
        String[] line = nextLine.split(",");
        WeatherDay weatherDay = buildWeatherDay(line);
        weatherDays[index] = weatherDay;
    }

    /**
     * We care about only certain columns in each weather data line, such as date, max temp, etc.
     * So we have pre-defined the columns that we want to extract out of each line, and discard the rest.
     * @param line
     * @return
     */
    private WeatherDay buildWeatherDay(String[] line) {
        Date date = new Date(Integer.valueOf(line[INDEX_YEAR]),
                Integer.valueOf(line[INDEX_MONTH]),
                Integer.valueOf(line[INDEX_DAY]));
        int tempHigh = Integer.valueOf(line[INDEX_TEMP_MAX]);
        double tempAvg = Double.valueOf(line[INDEX_TEMP_AVG]);
        int tempLow = Integer.valueOf(line[INDEX_TEMP_MIN]);
        double humidityAvg = Double.valueOf(line[INDEX_HUMIDITY_AVG]);
        double windAvg = Double.valueOf(line[INDEX_WIND_AVG]);
        double precipitation = Double.valueOf(line[INDEX_PRECIPITATION]);
        return new WeatherDay(date, tempHigh, tempAvg, tempLow, humidityAvg, windAvg, precipitation);
    }
}

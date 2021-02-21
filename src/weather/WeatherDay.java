package weather;

/**
 * This object represents one day’s historical weather data.
 * It will have a full constructor and the typical get methods;
 * you do not need to write set methods for it, however.
 * In addition to remembering and supplying this data, it can
 * also calculate the day’s heat index based on the high temperature
 * and the average humidity for the day.
 *
 */
public class WeatherDay {
    private Date date;
    private int tempHigh;
    private double tempAvg;
    private int tempLow;
    private double humidityAvg;
    private double windAvg;
    private double precipitation;

    /**
     * •In the toStringmethod, display all weather data, one item per line, nicely labeled.
     * @param date
     * @param tempHigh
     * @param tempAvg
     * @param tempLow
     * @param humidityAvg
     * @param windAvg
     * @param precipitation
     */
    public WeatherDay(Date date, int tempHigh, double tempAvg, int tempLow, double humidityAvg, double windAvg, double precipitation) {
        validateInput(date);
        this.date = date;
        this.tempHigh = tempHigh;
        this.tempAvg = tempAvg;
        this.tempLow = tempLow;
        this.humidityAvg = humidityAvg;
        this.windAvg = windAvg;
        this.precipitation = precipitation;
    }

    public WeatherDay(double tempAvg, double humidityAvg) {
        this.tempAvg = tempAvg;
        this.humidityAvg = humidityAvg;
    }

    public Date getDate() {
        return this.date;
    }

    public int getTempHigh() {
        return this.tempHigh;
    }

    public double getTempAvg() {
        return this.tempAvg;
    }

    public int getTempLow() {
        return this.tempLow;
    }

    public double getHumidityAvg() {
        return this.humidityAvg;
    }

    public double getWindAvg() {
        return this.windAvg;
    }

    public double getPrecipitation() {
        return this.precipitation;
    }


    /**
     * HI = -42.379 + 2.04901523*T + 10.14333127*RH - .22475541*T*RH - .00683783*T*T - .05481717*RH*RH + .00122874*T*T*RH + .00085282*T*RH*RH - .00000199*T*T*RH*RH
     * @return
     */
    public double calcHeatIndexNoaa() {
        double T = this.tempAvg;
        double RH = this.humidityAvg;
        double heatIndex = -42.379 + 2.04901523*T + 10.14333127*RH - 0.22475541*T*RH - 0.00683783*T*T - 0.05481717*RH*RH + 0.00122874*T*T*RH + 0.00085282*T*RH*RH - 0.00000199*T*T*RH*RH;
        return heatIndex;
    }
    /**
     *  The formula for this can be found on these two sites:
     *  Wikipedia: https://en.wikipedia.org/wiki/Heat_index
     *  NOAA: https://www.wpc.ncep.noaa.gov/html/heatindex_equation.shtml
     *  Use the first formula shown,
     *  with no adjustments or alternate calculations.
     *
     *  HI =c_{1}+c_{2}T+c_{3}R+c_{4}TR+c_{5}T^{2}+c_{6}R^{2}+c_{7}T^{2}R+c_{8}TR^{2}+c_{9}T^{2}R^{2}}
     * where
     *
     * HI = heat index (in degrees Fahrenheit)
     * T = ambient dry-bulb temperature (in degrees Fahrenheit)
     * R = relative humidity (percentage value between 0 and 100)
     * @return
     */
    public double calcHeatIndexWikipedia() {
        double T = this.tempAvg;
        double R = this.humidityAvg;
        double c1 = -42.379;
        double c2 = 2.04901523;
        double c3 = 10.14333127;
        double c4 = -0.22475541;
        double c5 = -6.83783 * Math.pow(10, -3);
        double c6 = -5.481717 * Math.pow(10, -2);
        double c7 = 1.22874 * Math.pow(10, -3);
        double c8 = 8.5282 * Math.pow(10, -4);
        double c9 = -1.99 * Math.pow(10, -6);
        return (c1 + (c2 * T) + (c3 * R) + (c4 * T * R) + (c5 * Math.pow(T, 2)) +
                (c6 * Math.pow(R, 2)) + (c7 * Math.pow(T, 2) * R) +
                (c8 * T * Math.pow(R, 2)) + (c9 * Math.pow(T, 2) * Math.pow(R, 2)));
    }

    /**
     * Display all weather data, one item per line, nicely labeled.
     *
     * @return
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Date: ").append(date);
        builder.append("\nHighest Temperature: ").append(tempHigh);
        builder.append("\nAverage Temperature: ").append(tempAvg);
        builder.append("\nLowest Temperature: ").append(tempLow);
        builder.append("\nAverage Humidity: ").append(humidityAvg);
        builder.append("\nAverage Wind Speed: ").append(windAvg);
        builder.append("\nPrecipitation: ").append(precipitation);

        return builder.toString();
    }

    /**
     * Throw an IllegalArgumentException if the date reference is null.
     * @param date
     */
    private void validateInput(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
    }

}

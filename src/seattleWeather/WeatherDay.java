package seattleWeather;

public class WeatherDay {
    private Date date;
    private int tempHigh;
    private double tempAvg;
    private int tempLow;
    private double humidityAvg;
    private double windAvg;
    private double precipitation;

    public WeatherDay(Date date, int tempHigh, double tempAvg, int tempLow,
            double humidityAvg, double windAvg, double precipitation) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        this.date = date;
        this.tempHigh = tempHigh;
        this.tempAvg = tempAvg;
        this.tempLow = tempLow;
        this.humidityAvg = humidityAvg;
        this.windAvg = windAvg;
        this.precipitation = precipitation;
    }

    public Date getDate(){
        return this.date;
    }

    public int getTempHigh(){
        return this.tempHigh;
    }

    public double getTempAvg(){
        return this.tempAvg;
    }

    public int getTempLow(){
        return this.tempLow;
    }

    public double getHumidityAvg(){
        return this.humidityAvg;
    }

    public double getWindAvg(){
        return this.windAvg;
    }

    public double getPrecipitation(){
        return this.precipitation;
    }

    public double calcHeatIndex(){
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
        return (c1 + c2*T + c3*R + c4*T*R + c5*Math.pow(T, 2) +
                c6*Math.pow(R, 2) + c7*Math.pow(T, 2)*R + c8*T*Math.pow(R, 2) +
                c9*Math.pow(T, 2)*Math.pow(R, 2));
    }

    public String toString(){
        return("Date: " + date +
               "\nHighest Temperature: " + tempHigh +
               "\nAverage Temperature: " + tempAvg +
               "\nLowest Temperature: " + tempLow +
               "\nAverage Humidity: " + humidityAvg +
               "\nAverage Wind Speed: " + windAvg +
               "\nPrecipitation: " + precipitation);
    }
}

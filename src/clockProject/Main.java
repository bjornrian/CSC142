package clockProject;

public class Main {
    public static void main(String[] args) {
        Time oneTime = new Time(12, 58, Time.DayPortion.PM);
        System.out.println(oneTime);
        Clock oneClock = new Clock(1, 59);

    }
}

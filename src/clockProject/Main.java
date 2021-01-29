package clockProject;

public class Main {
    public static void main(String[] args) {
        Time oneTime = new Time(12, 59, Time.DayPortion.PM);
        System.out.println(oneTime);
        Clock oneClock = new Clock(6, 45);
        System.out.println(oneClock);
    }
}

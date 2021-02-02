package clockProject;

/**
 * This main class creates a Time object "oneTime" to demonstrate its toString function.
 * This class also creates a Clock object "myClock" and sets the oneTime object to 1:23PM.
 * myClock is called with the oneTime object, which shows a canvas with a clock showing
 * 1:23.
 *
 * @author  Bjorn Rian
 * @version 2/2/21
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Time oneTime = new Time(1, 0, Time.DayPortion.AM);
        System.out.println(oneTime);

        System.out.println("Showing new default clock");
        Clock myClock = new Clock();
        Thread.sleep(1000);
        oneTime = new Time(1, 23, Time.DayPortion.PM);
        System.out.println("Showing new time: " + oneTime);
        myClock.setTime(oneTime);Thread.sleep(1000);
        oneTime = new Time(11, 1, Time.DayPortion.PM);
        System.out.println("Showing new time: " + oneTime);
        myClock.setTime(oneTime);
        Thread.sleep(1000);
        oneTime = new Time(5, 59, Time.DayPortion.PM);
        System.out.println("Showing new time: " + oneTime);
        myClock.setTime(oneTime);
        System.out.println(Clock.timeToHourRadians(2));
        System.out.println(oneTime.getHour());
        oneTime.setHour(2);
        System.out.println(oneTime.getHour());
    }
}

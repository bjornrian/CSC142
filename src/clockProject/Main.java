package clockProject;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Time oneTime = new Time(1, 0, Time.DayPortion.AM);
        System.out.println(oneTime);

        System.out.println("Showing new default clock");
        Clock myClock = new Clock();
        Thread.sleep(1000);
        oneTime = new Time(1, 23, Time.DayPortion.PM);
        System.out.println("Showing new time: " + oneTime);
        myClock.setTime(oneTime);
        myClock.redraw();
    }
}

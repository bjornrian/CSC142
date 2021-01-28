package clockProject;

public class Main {
    public static void main(String[] args) {
        Time eleven = new Time(12, 9, Time.DayPortion.PM);
        System.out.println(eleven);
        eleven.setMinute(8);
        System.out.println(eleven);
    }
}

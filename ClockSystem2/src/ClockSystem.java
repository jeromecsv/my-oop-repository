public class ClockSystem {

    private static final int HOUR = 15;
    private static final int MINUTE = 16;
    private static final int SECONDS = 45;
    private static final int MILLISECONDS = 59;

    public static void main(String[] args) {

        Clock clock;
        clock = new NormalClock(HOUR, MINUTE, SECONDS);
        System.out.println(clock.getTime());
        clock = new ExactClock(HOUR, MINUTE, SECONDS, MILLISECONDS);
        System.out.println(clock.getTime());
        clock = new TwelveHourClock(HOUR, MINUTE, SECONDS);
        System.out.println(clock.getTime());
        clock = new RomanClock(HOUR);
        System.out.println(clock.getTime());
        clock = new JapanClock(HOUR, MINUTE, SECONDS);
        System.out.println(clock.getTime());
        clock = new TwelveHourJapanClock(HOUR, MINUTE, SECONDS);
        System.out.println(clock.getTime());
    }
}

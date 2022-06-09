public class Main {
    public static void main(String [] args) {

        GeneralTime military = new MilitaryTime();
        GeneralTime normal = new NormalClock();
        GeneralTime exactTime = new ExactClock();
        GeneralTime japan = new JapanClock();
        GeneralTime twelve = new TwelveHourClock();
        GeneralTime twelveJapan = new TwelveHourJapanClock();
        GeneralTime romanNumeralClock = new RomanNumeralClock();
        military.time();
        normal.time();
        exactTime.time();
        japan.time();
        twelve.time();
        twelveJapan.time();
        romanNumeralClock.time();


    }
}

public class RomanClock extends Clock implements Hour{

    private int hour;



    public RomanClock(int hour) {
        this.hour = hour;
    }
    @Override
    public String getTime() {
        int hour = getHour();
        int[] values = {40,10,9,5,4,1};
        String[] romanLiterals = {"XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        for(int i=0;i<values.length;i++) {
            while(hour >= values[i]) {
                hour -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        return roman.toString();
    }

    @Override
    public int getHour() {
        return this.hour;
    }
}

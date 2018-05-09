package first_attempt;

public class Entry {

    public enum Activity {
        LIFT, BIKE, ROW;
    }

    private int month;
    private int day;
    private int weight;
    private double count;
    private Activity act;

    public Entry(int m, int d, int w, double c, Activity a) {
        month = m;
        day = d;
        weight = w;
        count = c;
        act = a;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getWeight() {
        return weight;
    }

    public double getCount() {
        return count;
    }

    public Activity getAct() {
        return act;
    }

    @Override
    /**
     * toString method for general use
     *
     * @return String in format of Date: xx/xx Activity: act Length: count unit Weight weight
     */
    public String toString() {
        return "Date: " + getMonth() + "/" + getDay() + " Activity: " + act + " Length: " + count + " Weight: " + weight;
    }

    /**
     * used when writing to a file
     *
     * @return String in format of month day act count weight
     */
    public String rawString() {
        return month + " " + day + " " + act + " " + count + " " + weight;
    }
}

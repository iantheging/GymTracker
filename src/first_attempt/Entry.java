package first_attempt;

public class Entry {

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

    public void prntStr() {
        System.out.printf("Activity: " + act.getName() + " Length: " + count + act.getUnit() + " Weight: " + weight)
    }
}

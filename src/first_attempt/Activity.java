package first_attempt;

public class Activity {

    private String name;
    private String description;
    private String unit;

    public Activity(String n, String d, String u) {
        name = n;
        description = d;
        unit = u;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUnit() {
        return unit;
    }

    /**
     * Allows changing of the description
     *
     * @param newD
     */
    public void changeDescription(String newD) {
        description = newD;
    }
}

package first_attempt;

public class Tracker {

    private double milesBiked;
    private double kmRowed;
    private double lbsWeight;
    private int month;
    private int day;


    /**
     * @param b how many miles biked
     * @param r how many kilometers rowed
     * @param w weight for that day
     * @param m month
     * @param d day
     */
    public Tracker(double b, double r, double w, int m, int d) {
        milesBiked = b;
        kmRowed = r;
        lbsWeight = w;
        month = m;
        day = d;
    }

    public double getMilesBiked() {
        return milesBiked;
    }

    public double getKmRowed() {
        return kmRowed;
    }

    public double getLbsWeight() {
        return lbsWeight;
    }

    /**
     * Prints the date numerically
     *
     * @return string in MM/dd format
     */
    public String getDateNumeral() {
        return month + "/" + day;
    }

    @Override
    public String toString() {
        String monthName;
        String dayName;
        switch (month) {
            case 1:
                monthName = "January";
                break;

            case 2:
                monthName = "February";
                break;

            case 3:
                monthName = "March";
                break;

            case 4:
                monthName = "April";
                break;

            case 5:
                monthName = "May";
                break;

            case 6:
                monthName = "June";
                break;

            case 7:
                monthName = "July";
                break;

            case 8:
                monthName = "August";
                break;

            case 9:
                monthName = "September";
                break;

            case 10:
                monthName = "October";
                break;

            case 11:
                monthName = "November";
                break;

            case 12:
                monthName = "December";
                break;

            default:
                monthName = "invalid month selected";
                break;

        }

        switch (day) {
            case 1:
                dayName = "1st";
                break;

            case 2:
                dayName = "2nd";
                break;

            case 3:
                dayName = "3rd";
                break;

            default:
                dayName = day + "th";
                break;
        }

        return monthName + " the " + dayName;
    }

}

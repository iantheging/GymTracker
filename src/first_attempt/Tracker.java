package first_attempt;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Tracker {

    private ArrayList<Entry> track;

    /**
     * Default contructor with a blank ArrayList
     */
    public Tracker() {
        track = new ArrayList<>();
    }

    /**
     * Reads in a previous Tracker
     * @param filename
     * @throws FileNotFoundException
     */
    public Tracker(String filename) throws FileNotFoundException {
        // TODO
    }

    /**
     * Adds a new entry to track
     *
     * @param m month
     * @param d day
     * @param w weight
     * @param c count
     * @param a activity
     */
    public void addEntry(int m, int d, int w, double c, Activity a) {
        track.add(new Entry(m, d, w, c, a));
    }

    /**
     * Gets all entries for a certain day by checking track for correct day
     *
     * @param m month
     * @param d day
     */
    public void getEntriesDay(int m, int d) {
        for (int i = 0; i < track.size(); i++) {
            if (track.get(i).getMonth() == m && track.get(i).getDay() == d) {
                track.get(i).prntStr();
            }
        }
    }

    /**
     * Transfers all entries to a spreadsheet
     */
    public void writeToSpreadsheet() {
        // TODO
    }

}

package first_attempt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

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
     * File should be in the expected rawString format
     *
     * @param filename
     * @throws FileNotFoundException
     */
    public Tracker(String filename) throws FileNotFoundException {
        try {
            File f = new File(filename);
            Scanner s = new Scanner(f);
            track = new ArrayList<>();

            while (s.hasNextLine()) {
                int m = Integer.parseInt(s.next());
                int d = Integer.parseInt(s.next());

                String activity = s.next();
                Entry.Activity a;
                switch (activity) {
                    case "LIFT":
                        a = Entry.Activity.LIFT;
                        break;

                    case "BIKE":
                        a = Entry.Activity.BIKE;
                        break;

                    case "ROW":
                        a = Entry.Activity.ROW;
                        break;

                    default:
                        a = Entry.Activity.LIFT;
                        break;
                }

                int c = Integer.parseInt(s.next());
                int w = Integer.parseInt(s.next());

                track.add(new Entry(m, d, w, c, a));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found to read from");
        }
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
    public void addEntry(int m, int d, int w, double c, Entry.Activity a) {
        track.add(new Entry(m, d, w, c, a));
    }

    /**
     * Gets all entries for a certain day by checking track for correct day
     *
     * @param m month
     * @param d day
     */
    public String getEntriesDay(int m, int d) {
        for (int i = 0; i < track.size(); i++) {
            if (track.get(i).getMonth() == m && track.get(i).getDay() == d) {
                track.get(i).toString();
            }
        }
        return "No entry found";
    }

    /**
     * Transfers all entries to a spreadsheet
     */
    public void writeToSpreadsheet() {
        // TODO
    }

    /**
     * Transfers all entries to a text file
     *
     * @param filename
     * @throws FileNotFoundException
     */
    public void writeToFile(String filename) throws FileNotFoundException {
        File f = new File(filename + ".txt");
        PrintWriter pw = new PrintWriter(f);

        for (Entry e : track) {
            pw.println(e.rawString());
        }

        pw.close();
    }

}

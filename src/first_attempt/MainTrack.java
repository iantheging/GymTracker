package first_attempt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MainTrack {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please select a choice");
            System.out.println("1: Enter in information manually");
            System.out.println("2: Read in from an existing file");
            System.out.println("Any other number: Exit the program");

            String userResponse = scan.next();
            System.out.println();

            if (Integer.parseInt(userResponse) == 1) {

                System.out.print("Name for new file: ");
                String filename = scan.next();
                addToFile(filename);

            } else if (Integer.parseInt(userResponse) == 2) {

                System.out.print("Name of file: ");
                String filename = scan.next();
                addToFile(filename);

            } else {
                break;
            }
        }
    }

    private static void addToFile(String filename) throws IOException {
        Scanner scan = new Scanner(System.in);
        File storage = new File(filename);
        Tracker track = new Tracker();

        while (true) {
            System.out.print("Enter Month: ");
            int m = scan.nextInt();
            System.out.print("Enter Day: ");
            int d = scan.nextInt();
            System.out.print("Enter weight: ");
            int w = scan.nextInt();
            System.out.print("Enter activity (RUN, BIKE, LIFT): ");
            String activity = scan.next();

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
            System.out.print("Enter count: ");
            double c = scan.nextDouble();

            track.addEntry(m, d, w, c, a);
            System.out.print("Enter 1 to exit, anything other number to add another entry: ");
            int exit = scan.nextInt();
            if (exit == 1) {
                break;
            }
            System.out.println();
        }
        track.writeToFile(storage);
    }
}

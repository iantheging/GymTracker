package Test;

import java.util.Scanner;

public class TrackerTest {

    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please select a choice");
            System.out.println("1: Enter in information manually");
            System.out.println("2: Read in from an existing file");
            System.out.println("Anything else: Exit the program");

            String userResponse = scan.next();

            if (Integer.parseInt(userResponse) == 1) {
                // TODO
            } else if (Integer.parseInt(userResponse) == 2) {
                // TODO
            } else {
                break;
            }
        }
    }
}

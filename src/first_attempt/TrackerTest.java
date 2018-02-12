package first_attempt;

public class TrackerTest {

    public static void main(String[] args) {
        Tracker test = new Tracker(8.0, 2.2, 180, 2, 8);
        System.out.println(test.getMilesBiked());
        System.out.println(test.getKmRowed());
        System.out.println(test.getLbsWeight());
        System.out.println(test.getDateNumeral());
        System.out.println(test.toString());
    }
}

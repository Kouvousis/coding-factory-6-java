package gr.aueb.cf.ch5;

/**
 * Σφάλματα αναπαράστασης δεκαδικών.
 */
public class WithoutEpsilonApp {

    public static void main(String[] args) {

        double actual = 0.0;
        double expected = 1;

        for (int i = 1; i <= 10; i++) {
            actual += 0.1;
        }

        if (actual == expected) {
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }

        System.out.println(actual);
        System.out.println(expected);
    }
}

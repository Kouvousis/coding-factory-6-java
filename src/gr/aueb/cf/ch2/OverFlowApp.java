package gr.aueb.cf.ch2;

/**
 *  Ελενχη την θπερχηληση στην περιπτοση ποθ συμβει
 */

public class OverFlowApp {

    public static void main(String[] args) {

        // Δηλωση και αρχικοποιηση μεταωλητων
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;

        // Εντολες
        result = num1 +num2;

        // Εκτυποση αποτελεσματος
        System.out.println("To αποτελεσμα ειναι" + result);

    }
}

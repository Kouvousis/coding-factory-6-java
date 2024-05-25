package gr.aueb.cf.ch2;

/**
 * Προσθετει δθο ακεραιους και εμαφανιζει το αποτελεσμα
 * στην κονσολα (standard output).
 */
public class AddApp {

    public static void main(String[] args) {

        // Δηλωση καια ρχικοποιση μεταβλητων
        int num1 = 7;
        int num2 = 12;
        int result = 0;

        // Εντολες
        result = num1 + num2;

        // Εκτυποση αποτελεσματων
        System.out.println("Το άθροισμα των " + num1 + " kai " + num2 + " είναι: " + result);
        System.out.printf("Το αθροισμα των %d και %d ειναι: %d", num1 , num2 , result);
    }
}

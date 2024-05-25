package gr.aueb.cf.ch2;

/**
 * Template for programing.
 * Πολλαπλασιαζει δυο ακεραιουσ και εκυπωνη το
 * αποτελεσμα στην κονσολα
 */
public class Output2App {

    public static void main(String[] args) {

        // Δηλωση και Αρχικοποιση μεταβλητων
        int price = 100;
        int quantity = 5;
        int totalPrice = 0;

        // Εντολεσ
        totalPrice = price * quantity;

        // Εκτυποση αποτελεσματων.
        System.out.printf("Quantity: %3d, Price: %d, Total Price: %,d\n", quantity, price, totalPrice);

    }
}

package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 *  Διαβαζει δυο ακεραιους απο τον stdin και του προσθετη
 *  και εκτυπονη το αποτελεσμα
 */
public class ScannerAddApp {

    public static void main(String[] args) {

        // Δηλωση και αρχηκοποιηση μεταβλητων
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Εντολεσ
        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        // Εκτυποση αποτελεσματων
        System.out.printf("%d + %d = %d", num1, num2, sum);

    }
}

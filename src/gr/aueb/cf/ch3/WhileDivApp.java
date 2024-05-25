package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρηστης εισαγει δυο ακεραιους μεχρι
 * ο απιρηθμητης να ειναι μηδεν.
 * Το προγραμμα ελενχει τον παρονομαστη αν ειναι 0, και αν ειναι 0 δινει την
 * δυνατοτητα στον χρηστη να συνεχισει
 * δινοντας παρονομαστη διαφορο του μηδενος
 */
public class WhileDivApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert two integers for division (numerator 0 for exit)");
            numerator = scanner.nextInt();
            denominator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is zero");
                break;
            }

            if (denominator == 0) {
                System.out.println("Denominator should not be zero");
                continue;
            }

            result = numerator / denominator;
            System.out.printf("%d / %d = %d", numerator, denominator, result);
        }
        System.out.println("Thanks for using our app!");
    }
}

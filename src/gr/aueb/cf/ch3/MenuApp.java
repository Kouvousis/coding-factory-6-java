package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανιζει ενα μενου επιλογων με
 * do/while. Η do/while εκτελιτε
 * οπωσδηποτε μια φορα.
 */
public class MenuApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice = 0;


        do {
            System.out.println("Choose one of the following CRUD choices (0 for exit):");
            System.out.println("1. Εισαγώγη (insert) Προϊοντος");
            System.out.println("2. Ενημέρωση (update) Προϊοντος");
            System.out.println("3. Διαγραφή (delete) Προϊοντος");
            System.out.println("4. Αναζήτηση (select) Προϊοντος");
            choice = in.nextInt();
        } while (choice != 0);

        System.out.println("Thank you!");
    }
}

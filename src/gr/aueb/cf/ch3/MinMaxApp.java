package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Επιλεγει τον μικροτερο / μεγαλθτερο ακεραιο
 * μεταξθ δυο ακεραιων ποθ εισαγει ο χρηστης.
 */
public class MinMaxApp {

    public static void main(String[] args) {
        Scanner sacnner = new Scanner(System.in);
        int num1= 0;
        int num2 = 0;
        int min = 0;
        int max = 0;
        boolean areEqual = false;

        System.out.println("Please insert two integers");
        num1 = sacnner.nextInt();
        num2 = sacnner.nextInt();

        if (num1 > num2) {
            min = num2;
            max = num1;
        } else if (num1 < num2) {
            min = num1;
            max = num2;
        } else {
            System.out.println("Inserted numbers are equal");
            areEqual = true;
        }
        if (!areEqual) {
            System.out.println("Min :" + min);
            System.out.println("Max :" + max);
        }
    }
}

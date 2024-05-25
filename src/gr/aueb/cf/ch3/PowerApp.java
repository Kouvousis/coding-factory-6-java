package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει το base^power.
 * Ο χρηστης δινει το base και power.
 */
public class PowerApp {

    public static void main(String[] args) {

        // Δηλωση καια ρψηκοποιηση μεταβλητων
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("Please give base and power.");
        base = in.nextInt();
        power = in.nextInt();

        while (i <= power) {
            result *= base;
            i++;
        }

        System.out.printf("%d ^ %d = %,d", base, power, result);
    }
}

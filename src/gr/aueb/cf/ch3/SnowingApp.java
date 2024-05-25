package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβαζει μια θερμοκρασια (ακεραια τιμη) απο το
 * standard input καθως και μια boolean τιμη που
 * αντιστοιχει στο αν βρεχει και αποφασιζει αν
 * χιονιζει (βρεχι ΚΑΙ θερμοκρασια< 0).
 *
 * @author dex
 */
public class SnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Please insert if raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert outside temperature");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);
        System.out.println("Is snowing: " + isSnowing);
    }
}

package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει το πλιθος των ψηφιων ενος
 * ακεραιου, με do/while. Για παραδειγμα,
 * αν ο χρηστης δωσει το 259, τοτε το πληθος
 * των ψηφιων ειναι 3.
 */
public class DigitCount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int copyOfNum = 0;
        int count = 0;
        int sumOfDigit = 0;
        int rightHandDigit = 0;

        System.out.println("Please insert an int:");
        num = in.nextInt();

        copyOfNum = num;

        do {
            count++;
            rightHandDigit = copyOfNum % 10;
            sumOfDigit += rightHandDigit;
            copyOfNum = copyOfNum / 10;
        } while (copyOfNum != 0);

        System.out.println("Digit count: " + count);
        System.out.printf("Sum of digits: " + sumOfDigit);

    }
}

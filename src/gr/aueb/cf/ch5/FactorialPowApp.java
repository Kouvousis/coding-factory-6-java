package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n
 * με τη χρήση τησ μεθόδου facto9n).
 */
public class FactorialPowApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert n");
        n = in.nextInt();

        System.out.printf("%d! = %d", n, facto(n));
    }

    /**
     * Calculates factorial
     * @param n     the input for n.
     * @return      the factorial of n.
     */
    public static int facto(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    /**
     * Calcualtes a^b.
     * @param a     base
     * @param b     power
     * @return      the power of a^b
     */
    public static int pow(int a,int b) {
        int power = 1;

        for (int i = 1; i <= b; i++) {
            power *= a;
        }

        return power;
    }
}

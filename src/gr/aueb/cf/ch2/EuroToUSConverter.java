package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 *  Λαμβανει απο το χρηστη ενα ακεραιο που συμωολιζει ενα ποσο σε ευρω και το μετρεπει
 *  με βαση καποια ισοτιμια σε US dollars and US cents.
 */
public class EuroToUSConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int euros = 0;
        int dollars = 0;
        int totalCents = 0;
        int remainingCents = 0;
        final int US_PARITY = 99;

        System.out.println("Please insert the amount in euro");
        euros = in.nextInt();

        totalCents = euros * US_PARITY;
        dollars = totalCents / 100;
        remainingCents = totalCents % 100;


        System.out.printf("%,d euros = %,d total cents = %,d dollars & %,d cents", euros, totalCents ,dollars, remainingCents);

    }
}

package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Keeps reading until a special input is given (sentinel) example -1
 */
public class SentinelApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please insert a num (-1 for exit)");
        //num = in.nextInt();

        while ((num = in.nextInt()) != -1) {
            iterations++;
            System.out.println("Please insert a num (-1 for exit)");
            //num = in.nextInt();
        }
        System.out.println("Positives count: " + iterations);
    }

}

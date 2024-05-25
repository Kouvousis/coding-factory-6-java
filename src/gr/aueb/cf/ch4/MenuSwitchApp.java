package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνη ενα μενού επιλογών και
 * ανάλογα με την επιλογή του χρήστη
 * δίνει feedback.
 */
public class MenuSwitchApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέφτε ενα απο τα παρακάτω (0 για έξοδο");
            System.out.println("1. One player game");
            System.out.println("2. Two player game");
            System.out.println("3. Team game");

            choice = in.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exit");
                    break;
                case 1:
                    System.out.println("Start one player game");
                    break;
                case 2:
                    System.out.println("Start two player game");
                    break;
                case 3:
                    System.out.println("Start team game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while (choice != 0);
        System.out.println("Thank you for playing the game");
    }
}

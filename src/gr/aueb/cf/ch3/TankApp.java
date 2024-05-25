package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβνει true/false απο το standard input για δυο
 * δεξαμενες. Αν και οι δυο εχουν καυσιμα < 1/4
 * αναβει κοκκινο. Αν η μια απο της δυο εχει < 1/4 τοτε
 * αναβει πορτοκαλη ενδηξει
 */
public class TankApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isLTQuarterTank1 = false;
        boolean isLTQuarterTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("PLease insert if tank 1 is LT quarter");
        isLTQuarterTank1 = in.nextBoolean();

        System.out.println("Please insert if tank 2 is LT quarter");
        isLTQuarterTank2 = in.nextBoolean();

        isOrange = (isLTQuarterTank1 && !isLTQuarterTank2) || (!isLTQuarterTank1 && isLTQuarterTank2);
        isRed = isLTQuarterTank1 && isLTQuarterTank2;

        System.out.println("The button is orange :" + isOrange);
        System.out.println("The button is red :" + isRed);
    }
}

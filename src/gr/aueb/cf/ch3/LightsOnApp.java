package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τα φωτα ενος αθτοκινητου αναβουν οταν
 * βρεχει και ταυτοχρονα ειτε ειναι σκοταδι
 * η τρεχει με ταχυτητα υψηλη. Ο χρηστης εισαγει
 * τα τρια παραπανω στοιχεια και το προγραμμα εκτυπωνει
 * αν τα φωτα αναβουν η οχι.
 */

public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isNight = false;
        boolean isRunning = false;
        int speed = 0;
        final int MAX_SPEED = 100;
        boolean lightsOn = false;

        System.out.println("Please insert if its raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if its night");
        isNight = in.nextBoolean();

        System.out.println("Please insert the speed of the car");
        speed = in.nextInt();

        isRunning = speed > MAX_SPEED;
        lightsOn = isRaining && (isNight || isRunning);

        System.out.println("Are lights on: " + lightsOn);


    }
}

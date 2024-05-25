package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateToSeconds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MINUTES_PER_SEC = 60;
        final int HOUR_PER_SEC = 60*60;
        final int DAY_PER_SEC = 24*60*60;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int secs = 0;
        int totalSeconds = 0;

        System.out.println("Please insert Days Hours Minutes and Seconds");
        days = in.nextInt();
        hours = in.nextInt();
        minutes = in.nextInt();
        secs = in.nextInt();

        totalSeconds = days * DAY_PER_SEC + hours * HOUR_PER_SEC + minutes * MINUTES_PER_SEC + secs;

        System.out.println("The total seconds are " + totalSeconds);

    }
}

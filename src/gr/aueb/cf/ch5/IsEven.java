package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 *
 */
public class IsEven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert a num");
        num = in.nextInt();
        System.out.printf("%d is %s even", num, isEven(num) ? "": "not");
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

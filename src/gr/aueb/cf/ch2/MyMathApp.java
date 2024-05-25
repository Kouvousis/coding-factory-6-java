package gr.aueb.cf.ch2;

/**
 * Demo of class math
 */
public class MyMathApp {


    public static void main(String[] args) {
        int num1 = -10;
        int num2 = 3;
        int num3 = 18;

        System.out.println("Το απολθτο του -10 ειναι: " + Math.abs(num1));
        System.out.println("Το μικροτερο μεταξυ 3 και 18 ειναι: " + Math.min(num2, num3));
        System.out.println("Το μεγαλιτερο μεταξυ 3 και 18 ειναι: " + Math.max(num2, num3));
    }
}

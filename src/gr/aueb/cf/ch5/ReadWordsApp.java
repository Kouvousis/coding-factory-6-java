package gr.aueb.cf.ch5;

import java.io.IOException;

/**
 * Διαβάζει διαδοχικά λέξεις και κενά.
 * Μέχρι να βρει τον χαραχτήρα #.
 */
public class ReadWordsApp {

    static boolean isHash = false;
    static char ch = ' ';

    public static void main(String[] args) throws IOException {

        do {
            consumeWord();
            System.out.println();
            consumeSpaces();
        } while (!isHash);
    }

    private static void consumeWord() throws IOException {
        while ((ch = (char) System.in.read()) != ' ') {
            if (ch == '#') {
                isHash = true;
                break;
            }
            System.out.print(ch + " ");
        }
    }

    private static void consumeSpaces() throws IOException {
        while ((ch = (char) System.in.read()) == ' ');
        if (ch == '#') {
            isHash = true;
        }
        if (!isHash) System.out.print(ch + " ");
    }


}

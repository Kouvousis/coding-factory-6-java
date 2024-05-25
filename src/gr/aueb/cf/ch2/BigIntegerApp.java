package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 *  Χρησιμοποιει την κλαση BigInteger ωστε να μην εχουμε θπερχηληση
 */
public class BigIntegerApp {

    public static void main(String[] args) {

        BigInteger myBigNum1 = new BigInteger("123456789123456789121241455678567571");
        BigInteger myBigNum2 = new BigInteger("123456987654");

        BigInteger result = myBigNum1.add(myBigNum2);

        System.out.println("The result is: " + result);
        System.out.printf("The result is: %,d,", result);

    }
}

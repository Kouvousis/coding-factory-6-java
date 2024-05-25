package gr.aueb.cf.ch5;

/**
 * Converts Fahrenheit to Celsius.
 */
public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {
        for (int i = -100; i <= 100; i +=10) {
            System.out.printf("%4d\u2109\t=\t%6.2f\u2103\n", i, convertFahrenheitToCelsius(i));
        }
    }

    /**
     * Converts Fahrenheit to Celsius.
     * @param fahrenheitDegrees     The input in Fahrenheit degrees.
     * @return                      Celsius degrees after converting from Fahrenheit.
     */
    public static double convertFahrenheitToCelsius (double fahrenheitDegrees) {
        return (fahrenheitDegrees - 32) * 5 / 9;
    }
}

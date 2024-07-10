package gr.aueb.cf.ch20.regex;

public class Main {

    public static void main(String[] args) {
        String s = "Red";
//        System.out.println(isRed(s));
//        System.out.println(isRedOrGreen(s));
//        System.out.println(isrRed(s));

        System.out.println(dotAnyChar(".4"));
        String s1 = regexSwap("Kouvousis Dimitris");
        System.out.println(s1);
    }

    public static boolean isRed(String s) {
        return s.matches("Red");
    }

    public static boolean isRedOrGreen(String s) {
        return s.matches("Red|Green");
    }

    public static boolean isrRed(String s) {
        return s.matches("[rR]ed");
    }

    public static boolean startsWithOneUppercaseLetterAndEndsWithIng( String s) {
        return s.matches("[A-Z]ing");
    }

    public static boolean startsWithOneUppercaseOrLowerCaseLetterAndEndsWithIng( String s) {
        return s.matches("[a-zA-Z]ing");
    }

    public static boolean startsWithOneUppercaseOrLowerCaseLetterOrDigitAndEndsWithIng( String s) {
        return s.matches("[a-zA-Z0-9]ing");
    }

    public static boolean letterAndDigit(String s) {
        return s.matches("\\w\\d");
    }

    public static boolean letterSpaceDigit(String s) {
        return s.matches("\\w\\s\\d");
    }

    public static boolean anySymbolAndDigit(String s) {
        return s.matches(".\\d");
    }

    public static boolean dotAnyChar(String s) {
        return s.matches("\\..");
    }

    public static boolean threeDigits(String s) {
        return s.matches("\\d{3}");
    }

    public static boolean inBetweenLetterDigit(String s) {
        return s.matches(".*\\w\\d.*");
    }

    public static boolean nestedSchema(String s) {
        return s.matches("\\[*\\d+]*");
    }

    public static boolean isEmail(String s) {
        return s.matches("\\w+\\.?\\w*@\\w+\\.[a-z]{2,4}");
    }

    public static String[] regexSplit(String s) {
        String[] tokens = s.split("\\s+");
        return tokens;
    }

    public static String regexReplaceAll(String s) {
        String strToReturn = s.replaceAll("\\s+", " " );
        return strToReturn;
    }

    public static String regexSwap(String s) {
        String strToReturn = s.replaceAll("(.*)\\s(.*)", "$2 $1");  // back-reference in groups
        return strToReturn;
    }


}

package gr.aueb.cf.ch7;

public class HelloString {

    public static void main(String[] args) {

        String s = "Alice";     // Length == 5, 0 - 4
        String s2 = new String("Bob");  // problematic we will explain later

        System.out.println("Length of \"Alice\": " + s.length());
        System.out.println("Length of \"Bob\" " + s2.length());
    }
}

package gr.aueb.cf.ch2;

/**
 * Output demo
 *
 * @author jim
 */
public class OutputApp {

    public static void main(String[] args) {
        int num = 1;
        long num2 = 23241098;

/*        System.out.println("Hello");
        System.out.print("Hello2");
        System.out.println();
        System.out.printf("Hello");

        System.out.println("Num is: " + num);
        System.out.printf("Num is %d", num);*/

        System.out.printf("Num is: %04d, Num2 is: %,4d", num ,num2);    // to 4 dipla sto d einai poses thesis tha vgazi kai me to 0 tis emfanizis

    }
}

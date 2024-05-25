package gr.aueb.cf.ch4;

/**
 * Εκτυπώνη 10 γραμμές απο
 * αστεράκια σε α΄θξουσα σειρά,
 * 1η σειρά 1 αστεράκη
 * 2η σειρά 2 αστεράκια
 * κ.ο.κ
 */
public class Stars10Asc {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package gr.aueb.cf.ch6;

public class FiilteringApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] evenArr = filterEven(arr);
        traverse(evenArr);
    }

    /**
     *
     * @param arr
     * @return
     */
    public static int[] filterEven(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        int count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }

        int[] returnedArr = new int[count];
        count = 0;
        for (int item : arr) {
            if (item % 2 == 0) {
                returnedArr[count] = item;
                count++;
            }
        }
        return returnedArr;
    }

    public static void traverse(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}

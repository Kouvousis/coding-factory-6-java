package gr.aueb.cf.ch6;

/**
 * Selection Sort
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {9, 34, 5, 2, 2, 7, 2, 9, 20};
        selectionSort(arr);
        traverseArray(arr);
    }


    /**
     * Sorting based on Selection sort.
     * @param arr The inputed array.
     */
    public static void selectionSort(int[] arr) {
        if (arr == null) return;
        int min;
        int minPosition;

        for (int i = 0; i < arr.length - 1; i++) {
            minPosition = i;
            min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minPosition = j;
                }
            }
            swap(arr, i, minPosition);
        }


    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void traverseArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

}


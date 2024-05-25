package gr.aueb.cf.ch8;

public class IndexOutOfBoundsApp {

    public static void main(String[] args) {
        int arr[] = new int[10];

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

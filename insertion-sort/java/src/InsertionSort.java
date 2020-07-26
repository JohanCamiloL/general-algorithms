/**
 * This class has an Static method who implements Insertion Sort algorithm.
 * @author JohanCamiloL
 */
public class InsertionSort {

    /**
     * Insertion sort algorithm implementation.
     * @param arr Array to be sorted.
     * @return Sorted array.
     */
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            final int elem = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > elem) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = elem;
        }

        return arr;
    }
}

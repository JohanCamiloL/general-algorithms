import java.util.Arrays;

/**
 * Main class to test the implemented algorithm.
 * @author JohnaCamiloL
 */
public class App {
    public static void main(String[] args) {
        final int[] arr = {2, 4, 5, 7, 87, 6, 55, 4, 3, 2, 3, 4, 5, 6, 44, 332, 3123, 234, 434, 234};
        final int[] arrSorted = InsertionSort.insertionSort(arr);

        System.out.print(Arrays.toString(arrSorted));
    }
}

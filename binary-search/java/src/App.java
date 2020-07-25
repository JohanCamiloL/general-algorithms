/**
 * Main class to test the implemented algorithm.
 * @author JohnaCamiloL
 */
public class App {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        int value = 13;

        System.out.printf("Number index with recursive impl: %d%n", BinarySearch.binarySearchRecursive(array, value, 0, array.length));
        System.out.printf("Number index with iterative impl: %d", BinarySearch.bynarySearchIterative(array, value, 0, array.length));
    }
}

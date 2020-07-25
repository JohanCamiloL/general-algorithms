/**
 * This class has an Static method who implements Binary Search algorithm.
 * @author JohanCamiloL
 */
public class BinarySearch {

    /**
     * Binary search recursive implementation.
     * @param array Numbers array.
     * @param value Value to be searched.
     * @param left Left boundary.
     * @param right Right boundary.
     * @return Element index, if not found, returns -1.
     */
    public static int binarySearchRecursive(int[] array, int value, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) >>> 1; // Bitshift operation.

        if (value == array[mid]) {
            return mid;
        } else if (value > array[mid]) {
            return binarySearchRecursive(array, value, mid + 1, right);
        } else {
            return binarySearchRecursive(array, value, left, mid - 1);
        }
    }

    /**
     * Binary search iterative implementation.
     * @param array Numbers array.
     * @param value Value to be searched.
     * @param left Left boundary.
     * @param right Right boundary.
     * @return Element index, if not found, returns -1.
     */
    public static int bynarySearchIterative(int[] array, int value, int left, int right) {
        while (left <= right) {
            int mid = (left + right) >>> 1; // Bitshift operation.

            if (value == array[mid]) {
                return mid;
            } else if (value > array[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}

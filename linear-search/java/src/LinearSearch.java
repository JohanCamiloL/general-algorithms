/**
 * This class has an Static method who implements Linear Search.
 * @author JohanCamiloL
 */
public class LinearSearch {

    /**
     * Linear search on array number elements
     *
     * @param array  array with 0 or more numbers.
     * @param number number to be searched
     * @return Index of the element to search, if not found, returns -1.
     */
    public static int linearSearch(int[] array, int number) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == number) {
                return index;
            }
        }

        return -1;
    }

}

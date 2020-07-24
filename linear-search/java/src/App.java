/**
 * Main class to test the implemented algorithm
 * @author JohanCamiloL
 */
public class App {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
        int number = 2;

        System.out.println(LinearSearch.linearSearch(array, number));
    }
}

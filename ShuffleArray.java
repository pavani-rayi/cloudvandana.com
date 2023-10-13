import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an array with the values (1, 2, 3, 4, 5, 6, 7)
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original Array: " + Arrays.toString(originalArray));

        // Shuffle the array
        shuffleArray(originalArray);

        System.out.println("Shuffled Array: " + Arrays.toString(originalArray));
    }

    private static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int randomIndex = random.nextInt(i + 1);

            // Swap the elements at randomIndex and i
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Test with Integer arrays
        Integer[] numbers1 = {1, 2, 3};
        Integer[] numbers2 = {4, 5, 6};
        Integer[] mergedNumbers = GenericArrayUtility.mergeArrays(numbers1, numbers2);
        System.out.println("Merged Integer Array: " + Arrays.toString(mergedNumbers));

        // Test with String arrays
        String[] fruits1 = {"Hey", "Milli"};
        String[] fruits2 = {"Danait", "Donat"};
        String[] mergedFruits = GenericArrayUtility.mergeArrays(fruits1, fruits2);
        System.out.println("Merged String Array: " + Arrays.toString(mergedFruits));
    }
}




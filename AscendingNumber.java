import java.util.Arrays;

public class AscendingNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};
        
        Arrays.sort(numbers); // Sorts in ascending order
        
        System.out.println("Ascending Order: " + Arrays.toString(numbers));
    }
}
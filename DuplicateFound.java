import java.util.*;

public class DuplicateFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read the elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Use a HashSet to check for duplicates
        Set<Integer> set = new HashSet<>();
        boolean duplicateFound = false;

        for (int num : arr) {
            if (set.contains(num)) {
                duplicateFound = true;
                break;
            }
            set.add(num);
        }

        // Output the result
        if (duplicateFound) {
            System.out.println("Duplicates found");
        } else {
            System.out.println("All unique");
        }
    }
}

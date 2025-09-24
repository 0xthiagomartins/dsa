public class Main {
    /**
     * Linear Search - Sequential search through array
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Target not found
    }
    
    /**
     * Binary Search - Iterative Implementation
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents overflow
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1; // Target not found
    }
    
    
    public static void main(String[] args) {
        // Test array (must be sorted for binary search)
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;
        
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Target: " + target);
        System.out.println();
        
        // Test linear search
        int resultLinear = linearSearch(arr, target);
        System.out.println("Linear Search:");
        System.out.println("Result: " + resultLinear);
        if (resultLinear != -1) {
            System.out.println("Element found at index: " + resultLinear);
        } else {
            System.out.println("Element not found");
        }
        System.out.println();
        
        // Test binary search
        int resultBinary = binarySearchIterative(arr, target);
        System.out.println("Binary Search:");
        System.out.println("Result: " + resultBinary);
        if (resultBinary != -1) {
            System.out.println("Element found at index: " + resultBinary);
        } else {
            System.out.println("Element not found");
        }
        System.out.println();
        
        // Test with element not in array
        int notFound = linearSearch(arr, 4);
        System.out.println("Searching for 4 (not in array): " + notFound);
    }
}

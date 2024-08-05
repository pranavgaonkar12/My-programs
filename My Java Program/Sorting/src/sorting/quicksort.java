package sorting;

public class quicksort {

    public static void main(String[] args) {
        int[] arr = {1, 7, 2, 4, 0}; // Example array to be sorted
        int n = arr.length; // Length of the array
        quickSort(arr, 0, n - 1); // Initial call to quickSort with the full array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print the sorted array
        }
    }

    // Method to perform QuickSort
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) { // Base condition: when low is no longer less than high
            int pidx = partition(arr, low, high); // Partition the array and get the pivot index
            quickSort(arr, low, pidx - 1); // Recursively sort the left subarray
            quickSort(arr, pidx + 1, high); // Recursively sort the right subarray
        }
    }

    // Method to partition the array and return the pivot index
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = low - 1; // Index for the smaller element

        // Loop to rearrange the elements based on the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // If current element is smaller than the pivot
                i++; // Increment the index for the smaller element
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (or pivot)
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i; // Return the partition index
    }

    // Worst-case time complexity: O(n^2)
    // Average-case time complexity: O(n log n)
    // Worst case occurs when the pivot is always the smallest or the largest element
}


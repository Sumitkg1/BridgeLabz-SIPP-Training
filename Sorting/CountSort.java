public class CountSort {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(arr);
        countSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);

    }
    public static void countSort(int arr[]) {
        int n = arr.length;
        int output[] = new int[n]; // output array
        int count[] = new int[101]; // assuming the range of input is 0 to 100

        // Initialize count array
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }

        // Store the count of each number
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Change count[i] so that it contains the actual position of this number in output[]
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the output array to arr[], so that arr[] now contains sorted numbers
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    public static void printArray(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    
}

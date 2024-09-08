public class SortedArray {
    public static boolean isSorted(int arr[], int idx) {
        // Base case: if we have checked all elements, the array is sorted
        if (idx == arr.length - 1) {
            return true;
        }
        // If the current element is greater than the next one, the array is not sorted
        if (arr[idx] > arr[idx + 1]) {
            return false;
        } 
        // If the array is sorted till now, check the next element
        return isSorted(arr, idx + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 2, 8};
        System.out.println(isSorted(arr, 0));
    }
}
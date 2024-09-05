import java.util.*;

public class InsertionSort {
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};

        // Insertion Sort
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > current){
                // Shift elements to the right
                arr[j+1] = arr[j];
                j--;
            }

            // Assign the current value to the correct position
            arr[j+1] = current; // Not arr[j+i]
        }

        PrintArray(arr);
    }
}
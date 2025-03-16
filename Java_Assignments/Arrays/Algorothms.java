// Implement a function to sort an array in ascending order using bubble sort or selection sort.
import java.util.*;

public class Algorothms {
    //Function for SelectionSort
    /*
    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // this is the 0 index first
            for (int j = i + 1; j < arr.length; j++) { // this is the next index at first run
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // if next element (j) is smaller then minIndex will be j
                }
            }
            // swapping
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    */

	//Function for Bubble Sort
    public static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        BubbleSort(arr); // function call

        System.out.println("After Bubble Sort:");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}

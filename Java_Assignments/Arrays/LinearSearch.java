// Create a program to search for a specific element within an array using linear search.
import java.util.*;

public class LinearSearch {

    public static boolean isFound(int arr[], int keyElement) {
        for (int num : arr) { // iterate through the array
            if (num == keyElement) {
                return true; // if found then it returns true
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = input.nextInt();
        System.out.println("Enter the elements of array:");
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt(); // take elements from user
        }

        System.out.println("Enter the element to search:");
        int keyElement = input.nextInt(); //key element that user find in array

        if (isFound(arr, keyElement) == true) { // isFound() function is called
            System.out.println(keyElement + " is found");
        } else {
            System.out.println(keyElement + " is not found");
        }

        input.close();
    }
}

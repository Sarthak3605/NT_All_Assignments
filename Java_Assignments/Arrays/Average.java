// Write a program to find the average of elements in an array.
import java.util.*;

public class Average {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int size = input.nextInt();
        int sum = 0; // this stores the sum of all elements of array
        int arr[] = new int[size];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        // this prints the average of type double (typecasted to double)
        System.out.println("Average of elements of array is: " + (double) (sum / arr.length));
    }
}

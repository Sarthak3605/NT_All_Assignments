// Write a program to print the Fibonacci sequence up to a specified number.
import java.util.*;
public class FibonacciSeries {
    public static void Fibonacci(int end) {
        int firstNum = 0, secondNum = 1;

        while (firstNum <= end) {
            System.out.print(firstNum + " ");

            int nextNum = firstNum + secondNum; //next number is the sum of first and second numbers

            // Swapping of numbers
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Take limit from user
        System.out.println("Enter the limit of sequence:");
        int end = input.nextInt();

        Fibonacci(end); // Function call

    }
}

// Implement a program to find the factorial of a given number.
import java.util.*;
public class Factorial {
    public static void main(String args[]) {
        // Take input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        System.out.println("Factorial of number is: " + fact);

    }
}

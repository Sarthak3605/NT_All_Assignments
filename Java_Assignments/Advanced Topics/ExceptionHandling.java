//Create a program to handle exceptions using try-catch blocks.
import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int numerator = input.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = input.nextInt();

            int result = numerator / denominator; // this may cause division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally { //this block will always run
            System.out.println("Execution completed.");
            input.close();
        }
    }
}


// Use loops to print patterns like a triangle or square.
import java.util.*;
public class Patterns {
    //function that prints the triangle pattern
    public static void Triangle(int row) {
        for (int i = row; i > 0; i--) {
            for (int j = i; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
   //Square function that prints the square pattern
    public static void Square(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = input.nextInt();
        System.out.println("Enter 1 for triangle and 2 for square:");
        int choice = input.nextInt(); //This allows user to choose the shape

        if (choice == 1) {
            Triangle(row); //Triangle() function call
        } else if (choice == 2) {
            Square(row);
        } else {
            System.out.println("Invalid input!!");
        }
    }
}

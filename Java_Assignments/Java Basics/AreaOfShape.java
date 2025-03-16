//Write a program to calculate the area of a circle, rectangle, or triangle based on user input.

import java.util.*;
public class AreaOfShape {

    // Function that returns the area of a circle
    public static double AreaOfCircle(int radius) {
        return Math.PI * radius * radius;
    }

    // Function that returns the area of a rectangle
    public static double AreaOfRectangle(double length, double width) {
        return length * width;
    }

    // Function that returns the area of a triangle, rounded to 2 decimal places
    public static double AreaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        // Take input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the shape to find the area:");
        System.out.println("1 for the Circle");
        System.out.println("2 for the Rectangle");
        System.out.println("3 for the Triangle");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Enter the radius of the circle: ");
            int radius = input.nextInt();
            System.out.printf("Area of Circle is: %.2f\n", AreaOfCircle(radius));
        } else if (choice == 2) {
            System.out.println("Enter the length and width of the rectangle: ");
            double length = input.nextDouble();
            double width = input.nextDouble();
            System.out.printf("Area of Rectangle is: %.2f\n", AreaOfRectangle(length, width));
        } else if (choice == 3) {
            System.out.println("Enter the base and height of the triangle: ");
            double base = input.nextDouble();
            double height = input.nextDouble();
            System.out.printf("Area of Triangle is: %.2f\n", AreaOfTriangle(base, height));
        } else {
            System.out.println("Invalid input!!");
        }
    }
}

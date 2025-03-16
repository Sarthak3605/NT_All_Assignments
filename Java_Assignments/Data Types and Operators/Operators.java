// Write a program to demonstrate the use of arithmetic, logical, and relational operators.

import java.util.*;
public class Operators {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Two numbers: ");
        float num1 = input.nextInt();
        float num2 = input.nextInt();

        System.out.println(" Arithmetic Operators:"); //arithmetic operators starts
        System.out.println("Addition of Numbers: " + (num1 + num2));
        System.out.println("Subtraction of Numbers: " + (num1 - num2));
        System.out.println("Multiplication of Numbers: " + (num1 * num2));
        System.out.println("Division of Numbers: " + (num1 / num2));
        System.out.println("Modulo of Numbers: " + (num1 % num2));

        System.out.println();

        System.out.println(" Logical Operators:");//logical operators starts
        System.out.println("num1 > 0 AND num2 < 50: " + (num1 > 0 && num2 < 50));
        System.out.println("num1 < 20 OR num2 > 0: " + (num1 < 20 || num2 > 0));
        System.out.println("NOT (num1 > 0): " + !(num1 > 0));

        System.out.println();//this creates new blank line

        System.out.println(" Relational Operators:"); //relational operators starts
        System.out.println("num1 EQUALS num2: " + (num1 == num2));
        System.out.println("num1 NOT EQUALS num2: " + (num1 != num2));
        System.out.println("is num1 less than num2: " + (num1 < num2));
        System.out.println("is num1 greater than num2: " + (num1 > num2));
        System.out.println("is num1 less than or equals than num2: " + (num1 <= num2));
        System.out.println("is num1 greater than or equals than num2: " + (num1 >= num2));
    }
}

// Implement a program to find the largest number among three given numbers using a conditional statement.

import java.util.*;
public class LargestNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any three numbers: "); //user will enter three numbers
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // using relational operators we will find the greater numbers among three numbers
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is greater among three");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is greater among three");
        } else {
            System.out.println(num3 + " is greater among three");
        }
    }
}

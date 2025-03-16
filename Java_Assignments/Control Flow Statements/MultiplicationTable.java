// Use a for loop to print a multiplication table.

import java.util.*;

public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to print multiplication table:");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int table = number * i;
            System.out.println(number + "*" + i + "=" + table);
        }
    }
}

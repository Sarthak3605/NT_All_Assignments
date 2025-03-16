// Write a program to check if a given number is prime using an if-else statement.

import java.util.*;
public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // because numbers less than 1 including 1 are not prime numbers
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false; // here we use sqrt because after sqrt we get only repeated numbers
        }

        return true; // it returns true as the number is not divided by any number
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();

        if (isPrime(number) == true) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}

// Create a program to calculate the sum of even numbers from 1 to 10 using a while loop.

public class SumOfNumbers {
    public static void main(String args[]) {
        int sum = 0, i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of even numbers from 1 to 10: " + sum);
    }
}

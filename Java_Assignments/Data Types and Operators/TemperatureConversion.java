// Create a program to convert a temperature from Celsius to Fahrenheit and vice versa

import java.util.*;
public class TemperatureConversion {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        float temperature = input.nextFloat();

        System.out.println("1.) Celsius to Fahrenheit\n2.) Fahrenheit to Celsius");
        int choice = input.nextInt(); //user chooses the conversion

        switch (choice) {
            case 1:
                System.out.printf("Temperature in \u00B0F: %.2f", (temperature * 9 / 5) + 32);
                break;
            case 2:
                System.out.printf("Temperature in \u00B0C: %.2f", (temperature - 32) * 5 / 9);
                break;
            default:
                System.out.println("Invalid Input!!");
                break;
        }
    }
}

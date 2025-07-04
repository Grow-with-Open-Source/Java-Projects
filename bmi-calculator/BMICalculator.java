// BMI CALCULATOR USING JAVA - FIRST OPEN SOURCE CONTRIBUTION THROUGH THIS PROJECT

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // This program calculates BMI based on user input

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the BMI Calculator!");

        // Get weight from user
        System.out.print("Please enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Get height from user
        System.out.print("Please enter your height in meters: ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Print the result
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Interpret the BMI value
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

        // Close the scanner
        scanner.close();
    }
}
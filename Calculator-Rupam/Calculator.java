import java.util.Scanner;

/**
 * A simple console-based calculator that supports basic arithmetic operations.
 * 
 * @author Rupam
 */
public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("========================================");
        System.out.println("       Simple Java Calculator");
        System.out.println("========================================");

        while (running) {
            System.out.println("\nSelect an operation:");
            System.out.println("  1. Addition (+)");
            System.out.println("  2. Subtraction (-)");
            System.out.println("  3. Multiplication (*)");
            System.out.println("  4. Division (/)");
            System.out.println("  5. Exit");
            System.out.print("\nChoice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1-5).");
                continue;
            }

            if (choice == 5) {
                System.out.println("Goodbye!");
                running = false;
                continue;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please select 1-5.");
                continue;
            }

            double num1, num2;
            try {
                System.out.print("Enter first number:  ");
                num1 = Double.parseDouble(scanner.nextLine().trim());
                System.out.print("Enter second number: ");
                num2 = Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
                continue;
            }

            double result;
            String operator;
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    operator = "+";
                    break;
                case 2:
                    result = subtract(num1, num2);
                    operator = "-";
                    break;
                case 3:
                    result = multiply(num1, num2);
                    operator = "*";
                    break;
                case 4:
                    try {
                        result = divide(num1, num2);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                        continue;
                    }
                    operator = "/";
                    break;
                default:
                    continue;
            }

            System.out.printf("Result: %.2f %s %.2f = %.2f%n", num1, operator, num2, result);
        }

        scanner.close();
    }
}

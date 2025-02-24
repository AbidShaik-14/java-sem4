import java.util.Scanner;

public class TwoNum {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Sum: " + add(num1, num2));
            System.out.println("Difference: " + subtract(num1, num2));
            System.out.println("Product: " + multiply(num1, num2));
            System.out.println("Quotient: " + divide(num1, num2));
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN;
        }
        return num1 / num2;
    }
}

import java.util.Scanner;
public class twocharnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String n1 = sc.next();
        System.out.print("Enter the second number: ");
        String n2 = sc.next();
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("Quotient: " + (num1 / num2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        sc.close();
    }
}

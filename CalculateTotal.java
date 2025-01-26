import java.util.*;
public class CalculateTotal {
    public static int calculateTotal(int value) {
        return value;
    }
    public static int calculateTotal(int value, int quantity) {
        return value * quantity;
    }
    public static int calculateTotal(int value1, int value2, int value3) {
        return value1 + value2 + value3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of calculation (1, 2, or 3):");
        int choice = sc.nextInt();
        int result = 0;
        switch (choice) {
            case 1:
                System.out.print("Enter a single value: ");
                int val = sc.nextInt();
                result = calculateTotal(val);
                break;
            case 2:
                System.out.print("Enter price and quantity: ");
                int price = sc.nextInt();
                int qty = sc.nextInt();
                result = calculateTotal(price, qty);
                break;
            case 3:
                System.out.print("Enter three values: ");
                int v1 = sc.nextInt();
                int v2 = sc.nextInt();
                int v3 = sc.nextInt();
                result = calculateTotal(v1, v2, v3);
                break;
            default:
                System.out.println("Invalid choice.");
                sc.close();
                return;
        }
        System.out.println("Total price: " + result);
        sc.close();
    }
}

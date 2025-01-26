import java.util.*;
public class ReverseArray {
    public static void reverse(String[] arr) {
        for (int l = 0, r = arr.length - 1; l < r; l++, r--) {
            String temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        sc.nextLine(); 
        String[] arr = new String[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
        sc.close();
    }
}

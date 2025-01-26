import java.util.*;

public class ArrayReverse {

    public static void reverse(String[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of items:");
        int size = input.nextInt();
        input.nextLine();

        String[] items = new String[size];
        System.out.println("Enter items:");
        for (int k = 0; k < size; k++) {
            items[k] = input.nextLine();
        }

        System.out.println("Original: " + Arrays.toString(items));
        reverse(items);
        System.out.println("Reversed: " + Arrays.toString(items));

        input.close();
    }
}

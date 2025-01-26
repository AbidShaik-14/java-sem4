import java.util.*;
public class Utility {
    public static void compare(int n1, int n2) {
        if (n1 == n2) 
            System.out.println("Both are equal.");
        else if (n1 > n2) 
            System.out.println(n1 + " is greater.");
        else 
            System.out.println(n2 + " is greater.");
    }
    public static void compare(char ch1, char ch2) {
        if (ch1 == ch2) 
            System.out.println("Both are equal.");
        else if (ch1 > ch2) 
            System.out.printf("'%c' is greater.\n", ch1);
        else 
            System.out.printf("'%c' is greater.\n", ch2);
    }
    public static void compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 == len2) 
            System.out.println("Both are equal in length.");
        else if (len1 > len2) 
            System.out.printf("\"%s\" is greater in length.\n", s1);
        else 
            System.out.printf("\"%s\" is greater in length.\n", s2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose comparison type (1: Integer, 2: Character, 3: String):");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter two integers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                compare(num1, num2);
                break;
            case 2:
                System.out.println("Enter two characters:");
                char ch1 = sc.next().charAt(0);
                char ch2 = sc.next().charAt(0);
                compare(ch1, ch2);
                break;
            case 3:
                sc.nextLine(); // Consume the leftover newline
                System.out.println("Enter the first string:");
                String str1 = sc.nextLine();
                System.out.println("Enter the second string:");
                String str2 = sc.nextLine();
                compare(str1, str2);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }
}

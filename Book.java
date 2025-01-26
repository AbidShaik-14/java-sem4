import java.util.*;
class Book {
    String title;
    String author;
    double price;
    int stock;
    Book(String titleStr, String authorStr, double cost, int quantity) {
        title = titleStr;
        author = authorStr;
        price = cost;
        stock = quantity;
    }
    Book(String titleStr, String authorStr) {
        this(titleStr, authorStr, 500.0, 10);
    }
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.print("Title: " + title);
        System.out.print(", Author: " + author);
        System.out.print(", Price: " + price);
        System.out.println(", Stock: " + stock);
    }
}

public class BookShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();
        scanner.nextLine();
        Book book;
        switch (choice) {
            case 1:
                System.out.println("Enter author name:");
                String author1 = scanner.nextLine();
                System.out.println("Enter title:");
                String title1 = scanner.nextLine();
                System.out.println("Enter price:");
                double price = scanner.nextDouble();
                System.out.println("Enter stock:");
                int stock = scanner.nextInt();
                book = new Book(title1, author1, price, stock);
                book.displayDetails();
                break;
            case 2:
                System.out.println("Enter author name:");
                String author2 = scanner.nextLine();
                System.out.println("Enter title:");
                String title2 = scanner.nextLine();
                book = new Book(title2, author2);
                book.displayDetails();
                break;
            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}

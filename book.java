import java.util.Scanner;
public class book {
    private int c; // Book code
    private String t; // Book title
    private double p; // Book price
    public book(int c, String t, double p) {
        this.c = c;
        this.t = t;
        this.p = p;
    }
    public int getC() {
        return c;
    }
    public String getT() {
        return t;
    }
    public double getP() {
        return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book code: ");
        int c = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter book title: ");
        String t = sc.nextLine();
        System.out.print("Enter book price: ");
        double p = sc.nextDouble();
        book b = new book(c, t, p);
        System.out.println("\n--- Book Details ---");
        System.out.println("Code: " + b.getC());
        System.out.println("Title: " + b.getT());
        System.out.println("Price: $" + b.getP());
        sc.close();
    }
}

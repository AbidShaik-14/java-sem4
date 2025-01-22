public class greateroftwonum {
    void compare(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " and " + b + " are equal");
        }
    }
    int compare(int a, int b, boolean returnGreater) {
        return a > b ? a : b;
    }
    public static void main(String[] args) {
        greateroftwonum g = new greateroftwonum();
        g.compare(5, 10);
        System.out.println("Greater number: " + g.compare(5, 10, true)); 
    }
}

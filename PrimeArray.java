import java.util.*;
public class PrimeArray {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    public static ArrayList<Integer> uniqueFilter(ArrayList<Integer> arr) {
        Set<Integer> set = new HashSet<>(arr);
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        ArrayList<Integer> primes = new ArrayList<>();
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        System.out.println("List of prime numbers: " + primes);
        ArrayList<Integer> uniquePrimes = uniqueFilter(primes);
        System.out.println("List of unique prime numbers: " + uniquePrimes);
        sc.close();
    }
}

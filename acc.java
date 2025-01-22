import java.util.Scanner;

public class acc{
    private double bal;

    public acc(double initBal) {
        if (initBal >= 0) {
            this.bal = initBal;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.bal = 0;
        }
    }

    public void deposit(double amt) {
        if (amt > 0) {
            this.bal += amt;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amt) {
        if (amt <= this.bal) {
            this.bal -= amt;
            System.out.println("Withdrawn: ₹" + amt);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return this.bal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        acc acc = null;

        while (true) {
            System.out.println("\n--- Account Menu ---");
            System.out.println("1. Start Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter initial balance: ");
                    double initBal = sc.nextDouble();
                    acc = new acc(initBal);
                    System.out.println("Account started with balance: ₹" + initBal);
                    break;

                case 2:
                    if (acc == null) {
                        System.out.println("Start an account first.");
                    } else {
                        System.out.print("Enter deposit amount: ");
                        double dep = sc.nextDouble();
                        acc.deposit(dep);
                        System.out.println("Deposited: ₹" + dep);
                    }
                    break;

                case 3:
                    if (acc == null) {
                        System.out.println("Start an account first.");
                    } else {
                        System.out.print("Enter withdrawal amount: ");
                        double wd = sc.nextDouble();
                        acc.withdraw(wd);
                    }
                    break;

                case 4:
                    if (acc == null) {
                        System.out.println("Start an account first.");
                    } else {
                        System.out.println("Current balance: ₹" + acc.getBalance());
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

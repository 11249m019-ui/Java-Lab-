
interface ATM {
    void withdraw(double amount);
}

interface Balance {
    void checkBalance();
}

class BankAccount implements ATM, Balance {
    double balance = 5000;

    public void withdraw(double amount) {
        try {
            if (amount > balance) {
                throw new Exception("Insufficient Balance!");
            }

            balance = balance - amount;
            System.out.println("Withdrawal Successful!");
            System.out.println("Withdrawn Amount: " + amount);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public void checkBalance() {
        System.out.println("Available Balance: " + balance);
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.checkBalance();
        account.withdraw(6000);
        account.checkBalance();
    }
}

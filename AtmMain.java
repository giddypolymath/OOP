package teller;

import java.util.Scanner;

class ATM {
    private double balance;
    private String correctPin;
    private int remainingAttempts;

    public ATM(double initialBalance, String pin) {
        balance = initialBalance;
        correctPin = pin;
        remainingAttempts = 3;
    }

    public boolean login(String enteredPin) {
        if (remainingAttempts > 0 && enteredPin.equals(correctPin)) {
            System.out.println("Login successful.");
            return true;
        } else if (remainingAttempts > 0) {
            remainingAttempts--;
            System.out.println("Invalid PIN. Remaining login attempts: " + remainingAttempts);
        } else {
            System.out.println("You've exceeded the maximum number of login attempts. Your account is blocked.");
        }
        return false;
    }

    public void getBalance() {
        System.out.println("The balance is: $" + balance);
    }

    public void setDeposit(double amount) {
        balance += amount;
        getBalance();
    }

    public void setWithdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            getBalance();
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

public class AtmMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ATM object with an initial balance of $1000 and PIN "1234"
        ATM atm = new ATM(1000.0, "1234");

        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.print("Enter your PIN: ");
            String enteredPin = scanner.nextLine();

            isLoggedIn = atm.login(enteredPin);
        }

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Make a Deposit");
            System.out.println("3. Make a Withdrawal");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.getBalance();
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    atm.setDeposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    atm.setWithdraw(withdrawalAmount);
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-4.");
            }
        }

        scanner.close();
    }
}

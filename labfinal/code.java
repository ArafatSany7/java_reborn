import java.util.InputMismatchException;
import java.util.Scanner;

// Custom exception for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Custom exception for invalid withdrawal amount
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

public class code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for account balance
            System.out.print("Enter your current account balance: ");
            double balance = scanner.nextDouble();

            // Prompt user for withdrawal amount
            System.out.print("Enter the amount you want to withdraw: ");
            double withdrawalAmount = scanner.nextDouble();

            // Check for invalid withdrawal amount
            if (withdrawalAmount < 0) {
                throw new InvalidAmountException("Withdrawal amount cannot be negative.");
            }

            // Check for insufficient balance
            if (withdrawalAmount > balance) {
                throw new InsufficientBalanceException("Insufficient balance for this transaction.");
            }

            // Perform withdrawal
            balance -= withdrawalAmount;
            System.out.println("Transaction successful! Your new balance is: " + balance);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } catch (InsufficientBalanceException | InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using our ATM. Have a great day!");
        }

        scanner.close();
    }
}
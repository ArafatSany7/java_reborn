import java.util.Scanner;

class insufficientBalanceException extends Exception {
    insufficientBalanceException(String message) {
        super(message);
    }
}

class inputMismatchException extends Exception {
    inputMismatchException(String message) {
        super(message);
    }
}

class invalidAmountException extends Exception {
    invalidAmountException(String message) {
        super(message);
    }
}

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double withdraw;

        System.out.println("Enter the amount to balance: ");
        double balance = sc.nextDouble();
        try {
            System.out.println("Enter the amount to withdraw: ");
            if (!sc.hasNextDouble()) {
                throw new inputMismatchException("Invalid input type. Please enter a number.");
            }
            withdraw = sc.nextDouble();
            withdraw(withdraw);
        } catch (insufficientBalanceException e) {

            System.out.println(e.getMessage());
        } catch (inputMismatchException e) {

            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
        }

    }

    public static void withdraw(double amount) throws insufficientBalanceException, invalidAmountException {
        double balance = 500;

        if (amount > balance) {
            throw new insufficientBalanceException("Insufficient balance for withdrawal.");
        } else if (amount <= 0) {
            throw new invalidAmountException("Invalid amount entered. Please enter a valid number.");
        } else {
            System.out.println("Withdrawal successful. Amount withdrawn: " + amount);
            balance -= amount;
        }
    }

    public static void withdraw(int amount) throws inputMismatchException {
        throw new inputMismatchException("Invalid input type. Please enter a number.");
    }

    public static void withdraw(String amount) throws invalidAmountException {
        throw new invalidAmountException("Invalid amount entered. Please enter a valid number.");
    }

}

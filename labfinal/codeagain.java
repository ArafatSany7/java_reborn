
import java.util.Scanner;

class insufficientBalanceException extends Exception {

    public insufficientBalanceException(String message) {
        super(message);
    }

}

public class codeagain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ballance amount : ");
        double balance = sc.nextDouble();

        try {
            System.out.print("Enter the amount you want to withdraw : ");
            double amount = sc.nextDouble();

            // if (!sc.hasNextDouble()) {
            // }
            withdraw(amount, balance);
        } catch (insufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void withdraw(double amount, double balance) throws insufficientBalanceException {
        if (amount > balance) {
            throw new insufficientBalanceException("Tor eto taka nai");
        } else if (amount < 0) {
            throw new insufficientBalanceException("Thik kore taka lekh");
        } else {
            System.out.println("Eibar thik ache ne taka " + amount);
        }
    }
}

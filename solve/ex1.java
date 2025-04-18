
import java.util.Scanner;

class InsufficientException extends Exception {

    public InsufficientException(String message) {
        super(message);
    }

}

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ballance = 500;
        System.out.print("Enter the amount you want to withdraw : ");
        int withdraw = sc.nextInt();

        try {
            checkMoney(withdraw, ballance);

        } catch (InsufficientException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void checkMoney(int withdraw, int ballance) throws InsufficientException {
        if (withdraw > ballance) {
            throw new InsufficientException("Taaka nai");
        } else {
            System.out.println("Withdrawal successful!");
        }

    }
}

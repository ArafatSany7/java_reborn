import java.util.Scanner;

public class exception2 {
    public static void main(String[] args) {
        int count = 1;
        do {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter number 1: ");
                double num1 = sc.nextInt();
                System.out.print("Enter number 2: ");
                double num2 = sc.nextInt();

                double res = num1 / num2;
                System.out.println("Result : " + num1 + "/" + num2 + "=" + res);
                count = 2;
            } catch (Exception e) {
                System.out.println("Exception " + e);
                System.out.println("You must enter an integer");

            }
        } while (count == 1);

    }
}

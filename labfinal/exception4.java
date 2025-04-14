import java.util.Scanner;

class notenoug extends Exception {
    notenoug(String s) { // constructor
        super(s);

    }
}

public class exception4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any amount : ");
        double amou = sc.nextDouble();
        try {
            withdraw(amou);
        } catch (notenoug e) {

            System.out.println("I am inside custom exception");
            System.out.println(e);
        }

    }

    public static void withdraw(double tk) throws notenoug {
        if (tk <= 0) {

            throw new notenoug("Not enough money");
        } else {
            System.out.println("Withdraw Confirmed");

        }

    }

}

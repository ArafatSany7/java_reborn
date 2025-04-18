
import java.util.Scanner;

class underage extends Exception {

    public underage(String s) {
        super(s);
    }

}

public class c2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age :  ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (underage e) {
            System.out.println(e.getMessage());
        }

    }

    public static void checkAge(int age) throws underage {

        if (age < 12) {
            throw new underage("You are not eligible");
        } else if (age > 30) {
            throw new underage("Old enough");
        } else {
            throw new underage("You are eligible");
        }
    }
}

import java.util.Scanner;

public class exceotion3 {
    public static void main(String[] args) {
        System.out.println("The programme start here ..");

        String s = null;
        int arr[] = { 2, 3, 4 };
        int x = 10;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a value you want to division by : ");
        int y = sc.nextInt();

        System.out.println("Enter an index value : ");
        int index = sc.nextInt();

        try {
            System.out.println("Result : " + x / y);
            System.out.println("The array elemetn is " + arr[index]);

        } catch (ArithmeticException e) {
            System.out.println("Inter valid number which is not 'ZERO'");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Enter valid index ");
            System.out.println(e);
        }
    }
}

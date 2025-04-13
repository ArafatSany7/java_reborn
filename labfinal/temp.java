
import java.util.Scanner;

public class temp {

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        temp converter = new temp();

        System.out.println("Enter celcious value : ");
        double celsius = sc.nextDouble();

        double fahrenheit = converter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");

        System.out.println("Enter value of Farenheit: ");
        fahrenheit = sc.nextDouble();
        celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
    }
}
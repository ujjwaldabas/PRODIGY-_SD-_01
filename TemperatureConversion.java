import java.util.Scanner;

public class TemperatureConverter {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("      TEMPERATURE CONVERTER");
        System.out.println("==================================");

        System.out.print("Enter Temperature: ");
        double temp = input.nextDouble();

        System.out.println();
        System.out.println("Choose Input Unit");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Enter Choice: ");

        int choice = input.nextInt();

        switch (choice) {

            case 1:
                convertFromCelsius(temp);
                break;

            case 2:
                convertFromFahrenheit(temp);
                break;

            case 3:
                convertFromKelvin(temp);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        input.close();
    }

    static void convertFromCelsius(double c) {

        double f = (c * 9 / 5) + 32;
        double k = c + 273.15;

        System.out.println("\nResult");
        System.out.println("Celsius    : " + c + " °C");
        System.out.println("Fahrenheit : " + f + " °F");
        System.out.println("Kelvin     : " + k + " K");
    }

    static void convertFromFahrenheit(double f) {

        double c = (f - 32) * 5 / 9;
        double k = c + 273.15;

        System.out.println("\nResult");
        System.out.println("Celsius    : " + c + " °C");
        System.out.println("Fahrenheit : " + f + " °F");
        System.out.println("Kelvin     : " + k + " K");
    }

    static void convertFromKelvin(double k) {

        double c = k - 273.15;
        double f = (c * 9 / 5) + 32;

        System.out.println("\nResult");
        System.out.println("Celsius    : " + c + " °C");
        System.out.println("Fahrenheit : " + f + " °F");
        System.out.println("Kelvin     : " + k + " K");
    }
}

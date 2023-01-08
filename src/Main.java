import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        // Scans the input temperature in Celsius.
        int celsius = scanner.nextInt();

        // Prints the converted temperature in Fahrenheit.
        System.out.println((9 * celsius) / 5 + 32);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        
        System.out.println("Conversor de temperaturas (Fahrenheit a Celsius).");
        System.out.println("Introduce 999 para salir.");
        
        while (true) {
            System.out.print("Introduce la temperatura en Fahrenheit: ");
            fahrenheit = scanner.nextDouble();
            
            if (fahrenheit == 999) {
                System.out.println("Programa finalizado.");
                break;
            }
            
            double celsius = 5.0 / 9.0 * (fahrenheit - 32);
            System.out.printf("La temperatura en Celsius es: %.2f°C%n", celsius);
        }
        
        scanner.close();
    }
}

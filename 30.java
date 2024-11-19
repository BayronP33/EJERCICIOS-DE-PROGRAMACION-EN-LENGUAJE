import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el rango máximo para buscar números primos: ");
        int rango = scanner.nextInt();

        System.out.println("Números primos del 1 al " + rango + ":");

        for (int num = 2; num <= rango; num++) {
            boolean esPrimo = true;

            for (int divisor = 2; divisor <= num / 2; divisor++) {
                if (num % divisor == 0) {
                    esPrimo = false; // Si es divisible por algún número, no es primo
                    break; // Salimos del bucle interno
                }
            }

            if (esPrimo) {
                System.out.print(num + " ");
            }
        }

        scanner.close(); 
    }
}

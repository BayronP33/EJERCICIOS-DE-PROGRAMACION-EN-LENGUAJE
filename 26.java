import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar tres números enteros positivos al usuario
        System.out.println("Ingrese el primer número entero positivo:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número entero positivo:");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número entero positivo:");
        int num3 = scanner.nextInt();

        // Validar que los números sean positivos
        if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
            System.out.println("Por favor, ingrese solo números enteros positivos.");
        } else {
            // Calcular el menor y el mayor
            int menor = Math.min(num1, Math.min(num2, num3));
            int mayor = Math.max(num1, Math.max(num2, num3));

            // Imprimir el resultado
            System.out.println("El menor número es: " + menor);
            System.out.println("El mayor número es: " + mayor);
        }
        scanner.close();
    }
}
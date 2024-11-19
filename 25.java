import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("CALCULADORA DE FACTORIAL Y FUNCION ACKERMAN");

        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer valores del usuario
        System.out.println("Ingrese el valor de x como número entero:");
        int numerox = scanner.nextInt();
        System.out.println("Ingrese el valor de y como número entero:");
        int numeroy = scanner.nextInt();
        System.out.println("Ingrese el valor de n como número entero:");
        int numero_n = scanner.nextInt();

        // Calcular el factorial
        System.out.println("Factorial de " + numero_n + " es: " + factorial(numero_n));

        // Calcular la función de Ackermann
        System.out.println("Ackermann(" + numerox + ", " + numeroy + ") es: " + ackermann(numerox, numeroy));

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método recursivo para calcular el factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Caso base
        }
        return n * factorial(n - 1); // Llamada recursiva
    }

    // Método recursivo para calcular la función de Ackermann
    public static int ackermann(int x, int y) {
        if (x == 0) {
            return y + 1; // Caso base 1
        } else if (y == 0) {
            return ackermann(x - 1, 1); // Caso base 2
        } else {
            return ackermann(x - 1, ackermann(x, y - 1)); // Caso recursivo
        }
    }
}

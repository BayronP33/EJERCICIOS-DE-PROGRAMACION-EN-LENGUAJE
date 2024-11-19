import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        int gcd = calcularGCD(num1, num2);
        System.out.println("El máximo común divisor (GCD) de " + num1 + " y " + num2 + " es: " + gcd);
    }

    // Método para calcular el GCD utilizando el algoritmo de Euclides
    public static int calcularGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

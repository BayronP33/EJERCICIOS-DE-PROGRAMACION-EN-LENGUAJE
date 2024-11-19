import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de área de rectángulos");

        // Solicitar datos al usuario
        System.out.println("Ingrese la base en cm del rectángulo: ");
        float base = scanner.nextFloat();

        System.out.println("Ingrese la altura en cm del rectángulo: ");
        float altura = scanner.nextFloat();

        // Calcular el área
        float area = base * altura;

        // Mostrar resultados
        System.out.println("El área del rectángulo es: " + area + " cm²");

        // Cerrar el scanner
        scanner.close();
    }
}
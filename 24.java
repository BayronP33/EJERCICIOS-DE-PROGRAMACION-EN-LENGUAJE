import java.util.Scanner;

public class EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los coeficientes desde el teclado
        System.out.print("Ingrese el coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el coeficiente c: ");
        double c = scanner.nextDouble();

        // Determinar si tiene solución
        double discriminante = b * b - 4 * a * c;

        if (a == 0) {
            // Caso especial: a == 0, no es una ecuación cuadrática
            System.out.println("Esto no es una ecuación cuadrática.");
        } else if (discriminante > 0) {
            // Dos soluciones reales
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("La ecuación tiene dos soluciones reales:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            // Una solución real
            double x = -b / (2 * a);
            System.out.println("La ecuación tiene una solución real:");
            System.out.println("x = " + x);
        } else {
            // No tiene soluciones reales
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += numero + i;
        }
        System.out.println("La suma de los 100 números siguientes es: " + suma);
        scanner.close();
    }
}

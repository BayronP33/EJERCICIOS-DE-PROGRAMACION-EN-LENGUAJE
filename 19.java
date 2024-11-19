import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de euros en decimal: ");
        float numero = scanner.nextFloat();
        float tipocambio = (float) 1.10;
        float resultado = numero * tipocambio;

        System.out.println("La cantidad de euros en dolares es: " + resultado);
        scanner.close();
    }
}

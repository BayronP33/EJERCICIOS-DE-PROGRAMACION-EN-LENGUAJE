import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un numero real:");
        double numero = scanner.nextDouble();
        System.out.println("Los numeros impares menores que " + numero + "son:"); 
        for (int i = 1; i < numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        scanner.close(); 
    }
}

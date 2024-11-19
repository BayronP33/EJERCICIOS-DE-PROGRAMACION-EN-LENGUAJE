import java.util.Scanner;

public class EOFReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce texto. Usa CTRL+D (Linux/Mac) o CTRL+Z (Windows) para finalizar:");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println("Leído: " + line);
        }

        System.out.println("Fin de la entrada detectado. Programa finalizado.");
        scanner.close();
    }
}
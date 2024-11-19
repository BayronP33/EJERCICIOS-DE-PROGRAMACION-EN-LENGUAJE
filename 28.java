import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int fortuna = random.nextInt(4) + 1;

        System.out.println("Tu número de la fortuna es: " + fortuna);

        // Evaluar el número de la fortuna con un switch
        switch (fortuna) {
            case 1:
                System.out.println("Hoy es tu día de suerte. Aprovecha las oportunidades que se presenten.");
                break;
            case 2:
                System.out.println("Alguien especial te dará una buena noticia pronto.");
                break;
            case 3:
                System.out.println("Confía en tus ideas; una de ellas puede ser un éxito.");
                break;
            case 4:
                System.out.println("La paciencia será tu mejor aliada hoy. Ten fe.");
                break;
            default:
                System.out.println("Algo inesperado sucederá, prepárate para lo mejor.");
                break;
        }
    }
}
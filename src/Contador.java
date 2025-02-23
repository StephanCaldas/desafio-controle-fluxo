import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o primeiro número: ");
        int parametroUm = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int parametroDois = scanner.nextInt();
        System.out.println();

        try {
            contar (parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {

            System.out.println("O segundo número tem que ser maior que o primeiro.");
        }

        scanner.close();
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int indice = 0; indice < contagem; indice++) {
            System.out.println("Imprimindo o número " + (indice + 1));
        }
    }
}

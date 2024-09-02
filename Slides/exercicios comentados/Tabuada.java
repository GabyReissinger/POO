import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        // Loop externo para iterar de 1 a 10
        for (int i = 1; i <= 10; i++) {
            // Imprime o cabeçalho da tabuada para o número atual
            System.out.println("Tabuada do " + i);

            // Loop interno para calcular e imprimir a multiplicação do número atual por 1 a
            // 10
            for (int j = 1; j <= 10; j++) {
                // Calcula e imprime o resultado da multiplicação
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            // Imprime uma linha em branco para separar as tabuadas
            System.out.println();
        }
    }

    public static void tabuada() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int multiplicador = sc.nextInt();
        int resultado = 0;
        // implementar a tabuada com uma caixinha botinha
        System.out.println("+---RESULTADO--+");
        for (int i = 1; i <= 9; i++) {
            resultado = multiplicador * i;
            if (resultado < 10) {
                System.out.println("| " + multiplicador + " x " + i + " = " + resultado + " |");
            } else {
                System.out.println("| " + multiplicador + " x " + i + " = " + resultado + "|");
            }

        }
        System.out.println("----------------");
        sc.close();

    }
}

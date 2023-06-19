

import java.util.Scanner;

public class CalculadoraDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean executarnotas = true;

        while (executarnotas) {
            System.out.print("Digite o número de notas : ");
            int quantidadeNotas = sc.nextInt();

            double somaNotas = 0;
            int contadorNotasValidas = 0;

            for (int i = 1; i <= quantidadeNotas; i++) {
                System.out.print("Digite a nota #" + i + ": ");
                double nota = sc.nextDouble();

                if (nota >= 0 && nota <= 100) {
                    somaNotas += nota;
                    contadorNotasValidas++;
                } else {
                    System.out.println("Nota inválida , digite  uma nota entre 0 e 100.");
                    i--;
                }
            }

            double media = somaNotas / contadorNotasValidas;
            System.out.println("Média aritmética  " + media);

            System.out.print("Deseja executar a calculadora novamente? (S/N): ");
            String opcao = sc.next();

            executarnotas = opcao.equalsIgnoreCase("S");
            System.out.println();
        }

        System.out.println("Programa encerrado.");

    }
}


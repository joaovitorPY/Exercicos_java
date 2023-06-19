import java.util.Scanner;

public class Escolha {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int i = 0; // atribuimos um valor inicial 0 como inicio
        int valor; // definimos um valor int

        while( i<=10){ // while que e enquanto o i for menor que 10 ira execulta o codigo .
            System.out.println("digite um numero entre 0 e 10 : ");
            valor = sc.nextInt();
            if(valor>10){ // e se (if) valor digitado pelo usuario for maior que dez (notificar que o numero digitado \n
                // não esta entre 0 e 10 )
                System.out.println("numero digitado não esta entre 0 e  10");
            }




        }

    }
}

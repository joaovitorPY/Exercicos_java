import java.util.Scanner;

public class banco {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        double conta,saque; // variavies com valores double



        System.out.println("digite o valor disponivel na sua conta : ");
        conta = sc.nextDouble();
        System.out.println("digite o valor do seu saque :");
        saque = sc.nextDouble();

        double saldo_atual = conta - saque;


        System.out.println("seu saldo atual e de : "+ saldo_atual);


    }
}

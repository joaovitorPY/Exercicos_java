import java.util.Scanner;

public class poupanca {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        double valor ,saldo, poupanca ,i;

        saldo = 1000.00;
        poupanca = 500.00;
        i = 0;

        while (i !=3){
            System.out.println("digite 1-para aplicar,2-para regastar,3-para sair :");
            i = sc.nextInt();

            if(i == 1){
                System.out.println("valor da aplicação : ");
                valor = sc.nextDouble();
                if(valor>saldo){
                    System.out.println("saldo de conta insuficiente");
                }
                else{
                    saldo = saldo-valor;
                    poupanca = poupanca +valor;
                    System.out.println("aplicação realizada com sucesso");
                }
                break;
            }
            if(i==2){
                System.out.println("valor do resgate:");
                valor = sc.nextDouble();
                if(valor>poupanca){
                    System.out.println("saldo de poupança insuficiente");
                }
                else{
                    saldo = saldo + valor;
                    poupanca = poupanca-valor;
                    System.out.println("regaste realizado com sucesso:");
                }


            }







        }

    }
}

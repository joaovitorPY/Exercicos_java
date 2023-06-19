import java.util.Scanner;

public class Bradesco {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        double valor, saldo , sacar, i;

        saldo = 1700.00;
        i = 0;

        System.out.println("bem-vindo(a) app do bradesco:");

        while(i<4){
            System.out.println("1-adcionar");
            System.out.println("2-consultar-saldo");
            System.out.println("3-sacar");
            System.out.println("4-sair");
            break;

        }
        System.out.println("escolha opção que deseja:");
        i= sc.nextDouble();

        if(i==1){
            System.out.println("adcione o valor que deseja na sua conta:");
            valor = sc.nextDouble();
            valor = valor + saldo;
            System.out.println("seu saldo agora e de "+valor);
            }
        if(i==2){
            System.out.println("seu saldo atual e de "+saldo);

        }
        if(i==3){
            System.out.println("deseja o valor que voce deseja sacar:");
            sacar = sc.nextDouble();

            if(sacar>saldo){
                System.out.println("saldo insuficiente");
            }
            else{
                saldo = sacar-saldo;
                System.out.println("seu saldo atual e de "+ saldo);
            }

        }

        System.out.println("voce saiu do app ate logo");

       

        }

    }


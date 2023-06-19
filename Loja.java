

import java.util.Scanner;

public class Loja {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("loja de frutas ");
        System.out.println(" 1 -laranja 2,5 R$ ");
        System.out.println("2 - pera 3,0  R$  ");

        System.out.println("digite o preço da fruta : ");
        double fruta = sc.nextDouble();

        System.out.println("digite valor do seu dinheiro : ");
        double dinheiro = sc.nextDouble();

        double troco = dinheiro - fruta;

        System.out.println("seu troco sera de : " + troco);





    }
}


import java.util.Scanner;

public class nota {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("....\\sistema de notas....\\");

        System.out.println("digite sua primeira nota : ");
        double nota1 = sc.nextDouble();

        System.out.println("digite sua segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("digite sua terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 +nota3) / 3;

        System.out.println("media da sua nota e " + media);

        if(media>=7.0){
            System.out.println("aprovado");
        }
        else if (media<=6.0) {
            System.out.println("recuperação");
        }




    }
}

import java.util.Scanner;

public class salario{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        double salario, salario_reajuste,novo_salario ;

        System.out.println("digite valor do seu salario:");
        salario = sc.nextDouble();

        if(salario==280){
            novo_salario = salario + (salario * 20);
            System.out.println("seu novo salario com reajusti: "+ novo_salario);
        }
        if(salario == 280 && salario == 700){
            novo_salario = salario + (salario *15);
            System.out.println("seu novo salario com reajusti :" + novo_salario);
        }


    }
}

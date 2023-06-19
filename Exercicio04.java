import java.util.Scanner;
public class Exercicio04{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        String nome, estado_civil;
        int salario,idade;

       System.out.println("digite seu nome:");
       nome = sc.nextLine();

       while(nome.length()<=3){
        System.out.println("nome deve ter mais de 3 caracteres");
        nome = sc.nextLine();
        break;
       }

       System.out.println("digite sua idade:");
       idade = sc.nextInt();

       while(idade>=0 ||idade<=150){
        System.out.println("sua idade e "+idade);
        break;
       }
       System.out.println("digite F-feminino OU M-masculino");
        char sexo = sc.next().charAt(0);

        while(sexo =='F' ||sexo =='M'){
            

        }
       

    }
}
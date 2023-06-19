import java.util.Scanner;

public class usuario {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        String usuario = "joaovitor";
        int senha = 8829; // senha recebe valor int numero interios
        int senha_permitida = senha;// senha ira receber valor de senha permitida

        System.out.println("digite seu usuario : ");
        usuario = sc.nextLine();
        System.out.println("digite sua senha : ");
        senha = sc.nextInt();

        if(senha==senha_permitida){ // se senha for igual a senha permitida (usuario encontrado)
            System.out.println("usuario encontrado");
        }
        else if (senha != senha_permitida) { // se não usuario não permitido
            System.out.println("usuario não econtrado");
            System.out.println("digite sua senha novamente ");

        }


    }
}

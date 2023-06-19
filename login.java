import java.util.Scanner;

public class login {
        public static void main(String[] Args){
            Scanner sc = new Scanner(System.in);
            String usuario,senha;
            for(int i=0;i<3;i++){
                System.out.println("digite seu nome :");
                usuario = sc.nextLine();
                System.out.println("digite sua senha :");
                senha = sc.nextLine();
                if(usuario.equals(senha)){// equals usado para comparar as strings em java (valores das variaveis )
                    System.out.println("nome igual a senha do  usuaro não permitido ");
                }
                else {
                    System.out.println("bem-vindo ao sistema");
                    break;
                }
            }






        }

    }

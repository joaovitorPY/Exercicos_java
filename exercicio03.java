import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        char turno;
        System.out.println("em qual turno voce estuda M-matutino , V-vespetino,N-noturno :");
        turno = sc.next().charAt(0);// metado de classe string que retorna caracter localizado entre ()
        // (0) indica que obter o primeiro valor do caracter

        if(turno =='M'){ // condicionais if
            System.out.println("Bom-dia");
        }
        else if (turno =='V') { //condicionais else if
            System.out.println("Boa-tarde");
        }
        else if (turno =='N') {//condicionais // else if
            System.out.println("Boa-noite");
        }
        else{
            System.out.println("opção invalida,tente novamente");
        }


    }
}

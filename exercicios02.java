
import java.util.Scanner;

public class exercicios02 {
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        char genero;
        System.out.println("escreva inicial do seu genero(F ou M) :");
        genero = sc.next().charAt(0); // retorna  o caracter que esta entre ()
        // (0) indicar que estamos obter o primeiro caracter da sequencia

        if(genero=='F'|| genero=='f'){
            System.out.println("feminista");
        }
        else if (genero=='M'||genero=='m') {
            System.out.println("masculino");
        }
        else{
            System.out.println("sexo invalido");
        }


    }
}






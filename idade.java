
import java.util.Scanner;

public class idade {
    public static void main(String[] Args){
       Scanner sc = new Scanner(System.in);
       System.out.println("digite sua idade :");
       int idade = sc.nextInt();

       if(idade<=18){
           System.out.println("voce e menor de idade ");
        }
       else{
           System.out.println("voce e maior de idade ");
       }

    }
}

import java.util.Scanner;

public class numeros {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero : ");
        int num1 = sc.nextInt();
        System.out.println("digite outro numero :");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("primeiro numero digitado " + num1 + " e maior do que o segundo numero " + num2);
        }
        else {
            System.out.println("segundo numero " + num2 + " e maior do que " +num1);
        }
    }
}

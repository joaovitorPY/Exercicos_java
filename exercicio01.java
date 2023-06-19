import java.util.Scanner;

public class exercicio01 {
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("digite o numero :");
        num1 = sc.nextInt();


        if(num1 > 0){
            System.out.println("numero e positivo");
        }
        else if (num1<0) {
            System.out.println("numero e negativo");
        }

    }
}

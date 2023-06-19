import java.util.Scanner;

public class Exercicios06 {
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int[] vetor_a = new int [5];
        int [] vetor_b = new int [5];

        for(int i = 0; i <vetor_a.length;i++){
            System.out.println("entre com um valor:" );
            vetor_a[i] = sc.nextInt();

            vetor_b[i] = vetor_a[i];
           
            
        }

        for(int i =0; i<vetor_a.length;i++){
            System.out.println(vetor_a[i]+"");
        }
        System.out.println();
          for(int i =0; i<vetor_b.length;i++){
            System.out.println(vetor_b[i]+"");
        }
        System.out.println();








    }
}

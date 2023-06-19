public class exercicios05 {
    public static void main(String[]Args){
        int [] vetor_a= new int[5];
        int [] vetor_B = vetor_a;
        //acessar valores do vetoris
        vetor_a[0] = 1;
        vetor_a[1] = 2;
        vetor_a[2] = 3;
        vetor_a[3] = 4;
        vetor_a[4] = 5;
        // imprimir os valores
        System.out.println(vetor_B[3]);
       

    }
}

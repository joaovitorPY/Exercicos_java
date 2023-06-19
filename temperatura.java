

public class temperatura {
    public static void main(String[] Args){
        double C,K,F,Re,Ra;
        double celsius = 2.43;

        F = celsius * 1.8 + 32;
        K = celsius + 273.15;
        Re = celsius * 0.8;
        Ra = celsius * 1.8 + 32 + 459.67;

        System.out.println("temperatura em Fahrenheit e " + F);
        System.out.println("temperatura em Kelvin e " + K);
        System.out.println("temperatura em Réaumur e " + Re);
        System.out.println("temperatura em Rankine e " + Ra);
    }
}

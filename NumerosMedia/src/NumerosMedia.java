package numerosmedia;

import java.util.Scanner;

public class NumerosMedia {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float num, soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite 10 números positivos");
            num = ler.nextFloat();
            soma += num; 
        }
        System.out.println("A soma é " + soma); 
        System.out.println("A média é " + soma / 10); 
    }
}

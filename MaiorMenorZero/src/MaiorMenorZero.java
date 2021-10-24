package maiormenorzero;

import java.util.Scanner;

public class MaiorMenorZero {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = ler.nextInt();

        if (numero > 0) {
            System.out.println("É maior que zero");
        } else if (numero < 0) {
            System.out.println("É menor que zero");
        } else {
            System.out.println("Igual a zero");
        }
    }

}

package metadenumero;

import java.util.Scanner;

public class MetadeNumero {

    public static void main(String[] args) {
        int a, b, soma = 0;
        float metade;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        a = teclado.nextInt();
        System.out.println("Digite outro: ");
        b = teclado.nextInt();
        soma = a + b;
        metade = soma / 2;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A metade é: " + metade);
    }

}

package menornumero;

import java.util.Scanner;

public class MenorNumero {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int valor[] = new int[4];

        for (int i = 0; i < valor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valor[i] = ler.nextInt();
        }

        int menor = valor[0];
        for (int i = 1; i < valor.length; i++) {
            if (valor[i] < menor) {
                menor = valor[i];
            }
        }

        System.out.println("Menor valor = " + menor);

    }

}

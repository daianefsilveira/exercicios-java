package lojadesconto;

import java.util.Scanner;

public class LojaDesconto {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double valor, valorFinal, desconto;

        System.out.println("Informe o valor do produto");
        valor = ler.nextDouble();

        desconto = valor * 0.40;
        valorFinal = valor - desconto;

        System.out.println("O valor do desconto é " + desconto);
        System.out.println("O valor final da compra é " + valorFinal);

    }

}

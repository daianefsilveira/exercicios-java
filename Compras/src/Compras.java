package compras;

import java.util.Scanner;

public class Compras {

    public static void main(String[] args) {
        int cont = 1;
        float valor = 0, total = 0;

        Scanner lerEntrada = new Scanner(System.in);
        while (cont <= 20) {
            System.out.println("Digite o valor do item " + cont);
            valor = lerEntrada.nextFloat();
            cont++;
            total += valor;
        }
        System.out.println("Total a pagar: R$ " + total);
    }
}

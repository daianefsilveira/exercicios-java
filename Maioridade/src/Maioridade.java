package maioridade;

import java.util.Scanner;

public class Maioridade {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont = 0, pessoas = 0, idade;

        while (cont < 20) {
            System.out.println("Informe a idade");
            idade = ler.nextInt();
            if (idade >= 18) {
                pessoas++;
            }
            cont++;
        }
        System.out.println("A quantidade de pessoas com idade maior ou igual a 18 anos é de " + pessoas);
    }
}

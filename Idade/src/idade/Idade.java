package idade;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int nasc = ler.nextInt();
        int i = 2021 - nasc;
        System.out.println("Sua idade é " + i);
        if (i >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }

}

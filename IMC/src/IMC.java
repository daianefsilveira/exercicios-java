package imc;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        double peso, altura, imc;

        System.out.println("Informe o seu peso");
        peso = ler.nextDouble();
        System.out.println("Informe a sua altura");
        altura = ler.nextDouble();
        imc = peso / altura;

        if (imc > 25) {
            System.out.println("Você está acima do peso!");
        } else {
            System.out.println("Você está saudável!");
        }

    }

}

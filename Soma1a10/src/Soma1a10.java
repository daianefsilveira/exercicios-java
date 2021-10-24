package soma1a10;

public class Soma1a10 {

    public static void main(String[] args) {

        int soma = 0;

        System.out.print("A soma dos 10 numeros é: ");
        for (int i = 1; i <= 10; i++) {
            soma += i;
        }

        System.out.println(soma);

        System.out.print("A soma utilizando while é: ");
        int soma2 = 0, i2 = 0;
        while (i2 <= 20) {
            soma2 += i2;
            i2++;
        }
        System.out.println(soma2);
    }
}

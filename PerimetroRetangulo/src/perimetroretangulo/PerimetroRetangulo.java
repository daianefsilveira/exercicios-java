
package perimetroretangulo;

import java.util.Scanner;

public class PerimetroRetangulo {

    public static void main(String[] args) {
        
        float base, altura, area, perimetro;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a base: ");
        base=ler.nextFloat();
        System.out.println("Digite a altura: ");
        altura=ler.nextFloat();
        
        perimetro=(base*2)+(altura*2);
        System.out.println("O perímetro do retamgulo é " + perimetro);
    }
    
}

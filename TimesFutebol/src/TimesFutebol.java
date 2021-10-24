
package timesfutebol;

import java.util.Scanner;

public class TimesFutebol {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Numero de gols do time 1");
	int time1 = ler.nextInt();
	
	System.out.println("Numero de gols do time 2");
	int time2 = ler.nextInt();
	
	if(time1 > time2) {
		System.out.println("O time 1 e o vencedor");
	}else if (time2 > time1) {
		System.out.println("O time 2 e o vencedor");
	}else {
		System.out.println("Empate");
	}
    }
    
}

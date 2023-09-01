package estruturaloop;

import java.util.Scanner;

public class ExercicioUmFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro número");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número");
		num2 = sc.nextInt();
		
		if (num1 < num2) {
			
			for (int i = num1; i <= num2; i++ ) {
				
				if (i % 3 == 0 && i % 5 == 0) {
					
					System.out.println(i + " é multiplo de 3 e 5");
				}				
			}	
			
		} else {
			System.out.println("Intervalo inválido");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
	}

}

package estruturaloop;

import java.util.Scanner;

public class ExercicioDoisFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num, countpar =0, countimpar =0;
	
		
		for (int i=1; i<=10; i++) {
			System.out.println("Digite o " + i + "°" +  " número");
			num = sc.nextInt();
			
			if (num %2 == 0) {
				countpar++;
				
			} else {
				countimpar++;			
			}			
		}
		
		System.out.println("Total de números pares: " + countpar);
		
		System.out.println("Total de números ímpares: " + countimpar);

		
		
		
		sc.close();
		
		
		
	}

}

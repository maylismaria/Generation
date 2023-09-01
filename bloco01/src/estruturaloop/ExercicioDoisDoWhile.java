package estruturaloop;

import java.util.Scanner;

public class ExercicioDoisDoWhile {

	public static void main(String[] args) {

		
Scanner sc = new Scanner(System.in);
		
		int num, cont=0;
		float media, soma =0;
		
		do {
			System.out.println("Digite um número: " );
			num = sc.nextInt();
			
			
			if (num > 0 && num % 3 == 0) {
				soma += num;		
				cont++;
			}
			
			media = soma / cont;
			
			
		} while (num !=0);
		System.out.println("a média dos números mmultiplos de 3 é : " + media);
	
	}
	
}


package estruturaloop;

import java.util.Scanner;

public class ExercicioUmWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int idade, count1 =0, count2=0; 
		
		int opcao =0;
		
		while (opcao >= 0) {
			System.out.println("Digite uma idade");
			idade = sc.nextInt();
			
			if (idade < 21 && idade > 0) {
				count1++;
			} else if (idade > 50 && idade > 0){
				count2++;
			} 	
			opcao = idade;
			}	
		
		System.out.println("Total de pessoas menores de 21 anos: " + count1);
		System.out.println("Total de pessoas maiores de 50 anos: " + count2);

		sc.close();	

		
	}
		
	}



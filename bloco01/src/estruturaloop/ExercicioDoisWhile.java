package estruturaloop;

import java.util.Scanner;

public class ExercicioDoisWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int idade, sexo, categoria;
		
		int back=0;
		int mf=0;
		int hm=0;
		int mfu=0;
		String resposta;
		
		while (true)  {
			
		System.out.println("Digite a idade do colaborador");
		idade = sc.nextInt();
		
		System.out.println("Digite o sexo do colaborador");
		sexo = sc.nextInt();
		
		System.out.println("Digite a categoria: ");
		categoria = sc.nextInt();
		
		{
		       if (sexo == 2 && categoria == 2)  {
				mf++;
			} else if ((sexo == 1 && categoria == 3) && idade > 40) {
				hm++;
			} else if ((sexo == 2 && categoria == 4) && idade <30 ) {
				mfu++;
			} else if (categoria == 1) {
				back++;
				
			} 
		
		System.out.println("Deseja continuar? (S/N) ");
		resposta = sc.next();
		if (resposta.equalsIgnoreCase("N")) 
			break;
		}
	
		}       
		    System.out.println("Número de pessoas desenvolvedoras backend: " + back);
			System.out.println("Número mulheres desenvolvedoras de FrontEnd: " + mfu);
			System.out.println("O número de homens desenvolvedores Mobile maiores de 40 anos:" + hm);
			System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos: " + mf);
		
		}  
	   
		
	}




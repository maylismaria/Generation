package entradaesaida;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		float n1,n2,n3,n4, diferenca;
		
		
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		n3 = sc.nextFloat();
		
		System.out.println("Digite o quarto número: ");
		n4 = sc.nextFloat();
		
		diferenca = ((n1 * n2 ) - (n3 * n4));
		
		System.out.printf("Diferença: %.2f ", diferenca);	

		sc.close();
		
		
	}

}

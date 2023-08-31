package entradaesaida;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		double salario, abono, novoSalario;
			
		System.out.println("Digite seu salário: ");
		salario = sc.nextDouble();
		
		System.out.println("Digite o abono: ");
		abono = sc.nextDouble();
		
		novoSalario = salario + abono;
		
		System.out.printf("Novo salário: R$ %.2f " , novoSalario);
		
		sc.close();
		
	}

}

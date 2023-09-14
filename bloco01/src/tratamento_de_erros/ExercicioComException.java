package tratamento_de_erros;

import java.util.Scanner;

public class ExercicioComException {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		double salario, abono, novoSalario;
		boolean entrada = false;
		
		while (!entrada) {
		try {			
		System.out.println("Digite seu salário: ");
		salario = sc.nextDouble();
		
		System.out.println("Digite o abono: ");
		abono = sc.nextDouble();
		
		novoSalario = salario + abono;
		
		System.out.printf("Novo salário: R$ %.2f " , novoSalario);
		entrada = true;
		
		} catch (java.util.InputMismatchException erro) {
			System.out.println("Você digitou um carcater ao invés de número. " + "\nExcecção: " + erro);	
			sc.nextLine();
		} 
		}
		sc.close();
		}
		} 
	



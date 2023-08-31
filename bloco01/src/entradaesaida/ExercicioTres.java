package entradaesaida;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Digite o valor do salário Bruto: ");
		salarioBruto = sc.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno: ");
		adicionalNoturno = sc.nextFloat();
		
		System.out.println("Digite o valor da hora extra: ");
		horasExtras = sc.nextFloat();
		
		System.out.println("Digita o valor dos descontos: ");
		descontos = sc.nextFloat();
		
		
		salarioLiquido = salarioBruto + adicionalNoturno + horasExtras * 5 - descontos;
		
		System.out.printf("Salário Liquido: R$  %.2f " , salarioLiquido);

		sc.close();
		
	}

}

package estruturarepeticao;

import java.util.Scanner;

public class exercicioUmIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a,b,c, soma;
		
		System.out.println("Digite o valor de A:");
		a = sc.nextInt();
		System.out.println("Digite o valor de B:");
		b = sc.nextInt();
		System.out.println("Digite o valor de C:");
		c = sc.nextInt();

		soma = a + b;
		
		if (soma > c) {
			System.out.println( a + " + " + b + " = " + soma + "> " + c  + " \nA soma de A + B é maior que C " );			
		}else if (soma < c ) {
			System.out.println( a + " + " + b + " = " + soma + " < " + c  + " \nA soma de A + B é menor que C " );			
		} else 
			System.out.println( a + " + " + b + " = " + soma + " = " + c  + " \nA soma de A + B é igual a C " );	
		
		sc.close();
	}
	
}

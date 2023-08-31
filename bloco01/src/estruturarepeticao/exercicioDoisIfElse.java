package estruturarepeticao;

import java.util.Scanner;

public class exercicioDoisIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		if ((num % 2 == 0) && (num >0 )) { 
		System.out.println("Numero par e positivo");
		} if ((num % 2 == 0)&& (num <0 )) {
			System.out.println("Numero par e negativo");
		} if ((num % 2 != 0) && (num >0 )) {
			System.out.println("Numero impar e positivo");
		} if ((num % 2 != 0) && (num < 0)) {
			System.out.println("Numero impar e negativo");
		} else {
			System.out.println("Caracter nao reconhecido");		
		}
		
		sc.close();
	}

}
